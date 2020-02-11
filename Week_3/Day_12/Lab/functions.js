// functions!

const varFunc = function (){
    return 'this is my function!'
}

const adder = function (num1, num2){
    return num1 + num2
}


// dontHoist()

// const dontHoist = function {
//     console.log('this function has been hoisted')
// }

console.log(varFunc())
console.log(adder(1,3))


const arrowFunc = () => { return 3}
const otherArrow = () => 3

console.log(otherArrow())

const chainFunc = () => () => () => () => 2

let lambda = "lambda calculus"

const nestFunc = () => {
    let x = 2
    
    const innerFunc = () => {
         x = 3
    }
    console.log(x)
    return x
}

console.log(nestFunc())

console.log(chainFunc())

// lab assignment 2, this function calculates bill amount with gratuity (tip at 20%)

const total = billAmount => {

    // array to store the two values we need (total and tip amount)
    const grat = billAmount => billAmount*0.20
    // let totalArr = []
    let totalObj = {
        bill:billAmount,
        gratuity:grat(billAmount),
        total:billAmount+grat(billAmount)
    }
    // totalArr.push(billAmount)
    // totalArr.push(grat(billAmount))
    // totalArr.push(billAmount+grat(billAmount))

return totalObj
}

console.log(total(150))