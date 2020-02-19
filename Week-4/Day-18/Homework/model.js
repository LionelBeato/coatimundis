// this class is defining our model
// remember that classes are just blueprints for objects

module.exports = class Duck {
    constructor(name){
        this.name = name
    }


    emoji = '🦆'
    wings = 2
    hasBill = true
    hasFeathers = true


    goQuack(){
        return 'Duck goes quack'
    }
}

