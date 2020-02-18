// this is an interface, an interface is sort of like a contract for your classes and objects
// interfaces describes properties but not the implementation, so functions for example are empty
interface user {
    name?: string
    age?: number
    loggedIn: boolean
    getStatus:() => boolean
}

// this is a class, a class is just syntatic sugar for an immediately invoked function expression (IIFE)
// this class implements the user interface so it needs to utitlize those properties
class Admin implements user {

    name:string
    age:number
    loggedIn:boolean

    constructor(name:string, age:number,loggedIn:boolean){
        this.name = name
        this.age = age
        this.loggedIn = loggedIn
    }

    getStatus() {
        console.log(this.loggedIn)
       return this.loggedIn
    }

}

let Mike = new Admin("Mike",34,true)


const myFunc = () => {
    Mike.getStatus()
}