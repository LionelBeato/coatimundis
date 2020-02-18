
interface user {
    name?: string
    age?: number
    loggedIn: boolean
    getStatus:() => boolean
}

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