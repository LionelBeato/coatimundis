# April 16, 2020 - Day 59

## Agenda

- Even more frontend refinements 
- Start working on our portfolios

## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 7:30a  | Settling in                      |
| 8:10a  | Slides & Presentation            |
| 9:30a  | Coffee Break                     |
| 9:40a  | Slides & Presentation            |
| 10:00a | Assignment                       |
| 12:00p | Lunch Break                      |
| 1:00p  | Lab Hours                        |
| 3:30p  | Class Dismissed & Office Hours   |

## Lab

### Gatsby Continued Refinements

1. Keep working on your frontends. If you haven't already, implement line clamping and some sort of a solution to viewing the full blog post. 

### Homework


### Pagination (Backend)

1. Our project currently has a limited amount of entities to handle, so it's fine that we render them all on one page. However, what if we were to have 25 entities, or 100, or even 500? That single page would be very long and probably very slow. This is where pagination comes in. 

2. We need to implement pagination in the backend. This is simple enough. First, go to your repository and change `CrudRepository` to `PagingandSortingRepository`, leaving the generic types. This interface has a bundle of new methods that we can utilize for pagination. 

3. Next, let's define our pages in our schema. We will also need to define a set total of pages. Inside my Query type, I've defined these additional fields: 

```GraphQL
    findAllPosts(pageNumber:Int, pageSize:Int):[Post!]
    getTotalPages(pageNumber:Int, pageSize:Int): Int
```

4. Moving on, we need to define DataFetchers that will align with our fields. Take a look at the following methods:

    ```Java


        public DataFetcher getPagedPostsDataFetcher(){
            return dataFetchingEnvironment -> {
                int pageNumber = dataFetchingEnvironment.getArgument("pageNumber");
                int pageSize = dataFetchingEnvironment.getArgument("pageSize");


                Pageable pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("date").descending());
                Page<Post> allPosts = postRepo.findAll(pageRequest);
                return allPosts;
            };
        }

        public DataFetcher getTotalPages(){
            return dataFetchingEnvironment -> {
                int pageNumber = dataFetchingEnvironment.getArgument("pageNumber");
                int pageSize = dataFetchingEnvironment.getArgument("pageSize");


                Pageable pageRequest = PageRequest.of(pageNumber, pageSize);
                Page<Post> allPosts = postRepo.findAll(pageRequest);
                return allPosts.getTotalPages();
            };
        }

    ```

    Note the instances of `Pageable` and `Page`. `Pageable` defines the properties of an object that can paged through and sorted. `Page` is the actual returned page instance. We equate this instance to our `findAll` method in our repo. This method accepts a `Pageable` object, completing the pagination code. 


5. Hook everything up through your `GraphQLProvider`. I'll leave it up to you on how to do this step! 

6. Test it out! Go into postman and attempt a paged query. Once you know it works, push your backend to heroku. Here is a sample query:

```GraphQL
query{
    findAllPosts(pageNumber:0,pageSize:5){
        date
        title
        body
    }
}
```

### Pagination (frontend)

1. Once it's been confirmed that the pagination works, we can move on to implementing it in our frontends. Do you have any ideas on how we could do this? Give it a thought! 

2. First we need to define our queries and variables like so:

```GraphQL
const PAGED_QUERY = gql`
  query($pageNumber: Int, $pageSize: Int) {
    findAllPosts(pageNumber: $pageNumber, pageSize: $pageSize) {
      title
      date
      body
    }
  }

  const TOTAL_QUERY = gql`
  query($pageNumber: Int, $pageSize: Int) {
    getTotalPages(pageNumber: $pageNumber, pageSize: $pageSize)
  }
`
```

3. Next we need to define a state that handles pages. I've created a seperate query component that will handle its own state and logic. Here is the hook for my state:

```React
  const [page, setPage] = useState({ pageNumber: 0, pageSize: 5 })
```

4. We now want to define a method that will allow us to switch between pages. I've created a click handler that does just that in my `PostQuery` component:

```JavaScript
  const handleClick = event => {
    const currentPage = event.target.innerHTML
    console.log(currentPage)
    setPage({ pageNumber: currentPage, pageSize: 5 })
  }
```

5. Now let's write some helpful code that will also us to use higher order functions on our page total number. I will make an array named `navArr` that will hold `x` amount of elements. `x` will be equal to the amount of pages available. This will be done with a traditional `for` loop. See the following:

```JavaScript
let navArr = []

  const navBuilder = (x) => {
    for (let i = 0; i <= x; i++) {
      navArr.push(i)
    }
  }

```

6. For my JSX, I'm going to use Apollo's `Query` component and pass in `PAGED_QUERY` as an attribute value. `data.posts.map` will now be `data.findAllPosts.map`:

```JSX
     <Query query={PAGED_QUERY} variables={page}>
        {({ data, loading, error }) => {
          if (loading) return <span>Loading...</span>
          if (error) return <p>{error.message}</p>

          return (
            <div>
              {/* simple map higher order function that will render all of our posts */}
              {
                data.findAllPosts.map(el => (
                  // Here I defined a prop for my Post component that lets me pass a class to its body
                  // this class is important for line-clamping (or truncating)
                  <Post
                    bodyStyle="line-clamp"
                    title={el.title}
                    date={el.date}
                    body={el.body}
                  />
                ))
           }
            </div>
          )
        }}
      </Query>
```

7. Finally, let's go ahead and create another Apollo `Query` component that will accept our `TOTAL_QUERY`. Here I have implemented it using theme-ui. Bear in mind that there may be a suitable implementation in your styling framework of choice. Note the following:

```JSX


        <Query query={TOTAL_QUERY} variables={page}>
          {({ data, loading, error }) => {
            if (loading) return <span>Loading...</span>
            if (error) return <p>{error.message}</p>

            return (
              <div>
                {navBuilder(data.getTotalPages)}
                {console.log(navArr)}
                <Grid gap={2} columns={12}>
                  {navArr.map(el => (
                    <Box><span onClick={handleClick} class="title">{el}</span></Box>
                  ))}
                </Grid>
              </div>
            )
          }}
        </Query>

```

8. Now we just need to make sure this code is called wherever we want it to render. Since I created a seperate `PostQuery` component, I need to add to my `index.js` like so: `<PostQuery />`. Keep in mind that you would need to import the component. 

9. Test it out and see if it works! If you made your elements appear clickable, the experience should be relatively seamless. my css class `title` changes the element's text to blue and the cursor to a pointer icon, indicating that it's a clickable link. 

## Notes

### On Pagination 

So our pagination example above works fine, but it may not be considered ideal for production as there alternate methods within the gatsby API, the graphQL API, and the Apollo API. Our solution is more or less legitimate but not without its bugs. On your own time, I recommend researching pagination solutions that may fit your data best. 

`PagingAndSortingRepository` is very useful, regardless. Note that `JpaRepository` extends `PagingAndSortingRepository` so it may be simplest to use that interface instead for future Java Projects. 


## Quote of the Day 
```
 ________________________________________
/ Ask yourself whether you are happy and \
| you cease to be so.                    |
|                                        |
\ -- John Stuart Mill                    /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||

```