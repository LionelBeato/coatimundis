// import {Employee} from './employee'

let x: string = 'four'
console.log(x)

function sayHello(person: string): string {
    return `Hello ${person}`
}

console.log(sayHello('mike'))

// enum type, sometimes displayed in all uppercase
// typically defines a list of constant options 
enum CardTypes { Debit, Credit, Virtual }
let card: CardTypes = CardTypes.Debit


// void type means the function doesnt return anything
function noReturn(): void {
    console.log('there is no return')
    // the return statement below is illegal
    // return 'string'
}

// any type
// dynamic type value that skips typechecking during evalulation
let y: any = 4
y = 'four'
y = true


interface Person {
    name: string
    birthday: number
    SSN: number
    likesPizza?:boolean
    sayHello()
}

// a class defines shape and functionality
// it supports inheritance
// its always declared with a new statement 
export class Employee implements Person {
    name
    birthday
    SSN
    age

    // constructors are kind of like a contract for when you're making an instance
    // it defines what you need when making an instance 
    constructor(name, birthday, SSN) {
        this.name = name
        this.birthday = birthday
        this.SSN = SSN
    }

    sayHello() {
        return 'This worker says hello!'
    }
}

let mike = new Employee('mike', 081690, 43243243245)

console.log(mike.sayHello())

// this is called a generic
// a generic is a component that can be applied across many types
// this allows us to have the flexibility of the any type...
// ...with the typechecking of explicit return values 
function fun<T>(arg:T){
    return arg
}
console.log(fun<number>(3))
console.log(fun<string>('three'))

function otherHello<T>(person){
    return `Hello ${person}`
}

console.log(otherHello<number>(3))





