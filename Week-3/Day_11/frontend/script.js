const myFunc = () => {
    fetch('https://rocky-forest-78029.herokuapp.com/data', {
    })
        .then(response => response.json())
        // .then(json => console.log(json))
        .then(json => document.getElementById("apples").innerHTML = `there are ${json.amount} ${json.name}`)
}