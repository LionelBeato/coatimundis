



const myFunc = () => {
    fetch('http://localhost:3000/data', {
        mode:'no-cors'
    })
    .then(response => {response.json()})
    .then((json) => console.log(json))
    document.getElementById("apples").innerHTML = `there are ${apples.amount} ${apples.name}`
}