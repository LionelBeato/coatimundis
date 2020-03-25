# March 25, 2019 - Day 43


## Agenda

- Add a new model to your backend.
- Create a mutation for your GraphQL API. 

## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 7:30a  | Settling in                      |
| 8:10a  | Lab Time                         |
| 9:30a  | Coffee Break                     |
| 9:40a  | Lab Time                         |
| 12:00p | Lunch Break                      |
| 1:00p  | Slides & Presentation            |
| 2:00p  | Assignment                       |
| 3:30p  | Class Dismissed & Office Hours   |

## Lab

### New Model and Gatsby Update

1. Work on your Gatsby frontends. 
2. In your backends, create a new model with the appropiate GraphQL code and schema definitions. 
3. Add items of your model type using SQL. 
4. Make a new corresponding Gatsby page for your new model.  

## Homework

### Add mutation

1. In your Java graphQL project, got your schema and add a new type called `Mutation`. 
2. For your `Mutation` type, add a field that will create a new entity like so:

```GraphQL
type Mutation {
    createArcadeGame(name:String, amountOfPlayers:Int):ArcadeGame!
}
```
3. In your GraphQLDataFetchers class, add a method for creating a new entity like so:

```Java
    public DataFetcher createArcadeGame(){
        return dataFetchingEnvironment -> {
            String name = dataFetchingEnvironment.getArgument("name");
            int amountOfPlayers = dataFetchingEnvironment.getArgument("amountOfPlayers");
            ArcadeGame newArcadeGame = new ArcadeGame(name, amountOfPlayers);
            arcadeGameRepository.save(newArcadeGame);
            return newArcadeGame;
        };
    }
```

4. Once that's done, update your Provider so that it has the new `Mutation` type. 

5. In your `Runner`, wrap the list code with a `while (true)` block so that the code continously updates. 

6. Test your code with Postman! **Take note that GraphQL seems picky about your formatting and indentation.** Here is an example mutation query with my code:

```GraphQL

mutation{
    createArcadeGame(name:"new", 
    amountOfPlayers:1){
        id
        name 
    }
}

```

## Quote of the Day 
```
 ________________________________________
/ Gates' Law: Every 18 months, the speed \
| of software halves.                    |
|                                        |
\ -- From a Slashdot.org post            /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||


```