function myFunction() {

    let inches  = prompt("input your height in inches")
    let cm = 2.54*inches
    
    console.log(`${inches} inches is equal to ${cm} centimeters`)
    document.getElementById("myId").innerHTML = `${inches} inches is equal to ${cm} centimeters`

}

function myOtherFunc(){
    document.getElementById("myId").innerHTML = "this document function works"
}


// jquery example, don't worry too much about this! 
// $('#circle').click(function() {
//     alert('Clicked!');
//    });

// conditional code


let myVar = 4535345
let myOtherVar = 3443

if (myVar > myOtherVar) {
    alert(`${myVar} is bigger than ${myOtherVar}`)
}
