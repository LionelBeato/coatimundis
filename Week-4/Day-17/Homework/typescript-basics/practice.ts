// typescript is a superset of javascript
// all javascript is legal typescript
// but not all typescript is legal javascript

// typically, typescript code will compile to javascript
// you would then use the .js file that gets rendered

class Animal {
    name:string
    color:string
    isAnAnimal(){
        return true
    }
}

// this interface only cares about satisfying the contract
// the contract means you need to add the interface properties into your class
interface LaysEgg {
     layAnEgg()
}

// this class extends Animal, meaning it inherits properties from that parent class
// it also implements LaysEgg, meaning I need to add that interface's properties into my class
class Duck extends Animal implements LaysEgg {
    wings = true
    quack(){
        return 'Duck goes quack'
    }

    layAnEgg(){
        return 'this duck laid an egg!'
    }  
}

// note how my LaysEgg method is different here
// interfaces do not care about the implementation, only that you satisfy the contract
class Chicken extends Animal implements LaysEgg{
    wings = true
    layAnEgg(){
        return 'this chicken laid an egg!'
    }
}

class Mouse extends Animal  {
    name:string
    whiskersAmount:number
    tailColor:string

    constructor (w:number, t:string){
        super()
       this.whiskersAmount = w
       this.tailColor = t
    }

    squeek(){
        return 'mouse goes squeek!'
    }
}

// constructing new objects with my defined classes
// think of Duck and Chicken as user-created types
const daffy = new Duck()
const foghorn = new Chicken()

const mickey = new Mouse(3, 'pink')

// console.log(daffy.layAnEgg())
// console.log(foghorn.layAnEgg())
console.log(mickey.tailColor)