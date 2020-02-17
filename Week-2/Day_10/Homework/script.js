function onClick(){
    updateLabel();

}

function checkEmptyInput(){
    if(getNumber1() === '' || getNumber2() === ''){

    }

}

function updateLabel(){
    var parameter1 = getNumber1()
    var parameter2 = getNumber2()
    var sum = parseInt(parameter1) + parameter2
    label.textContent = parameter1 + '+' + parameter2 + '=' + sum;
}

function getNumber1(){
    return inputs[0].value
}

function getNumber2(){
    return inputs[1].value

}

console.log("hello students!")
var inputs = document.querySelectorAll('input')
var label = document.querySelector('p')
var button = document.querySelector('button')
button.addEventListener('click', onClick)