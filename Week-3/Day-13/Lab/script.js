// Decision statements
let x = 4
let y = 4
let z = 5
if (x === 4) {
    if (y > 3) {
        if (z === 5){
            console.log(z)
        }
    }
}

if (z === 4){
    console.log(z)
} else if (y === 5) {
    console.log(y)
} else if (z > 10) {
    console.log(y)
} else {
    console.log(z)
}

let foo = 'foofoo'
switch (foo){
    case 'bar':
        console.log(foo)
        break
    case 'hello':
        console.log('hello')
    default:
        console.log('nothing to state')
}

// Looping statements

for(let i = 0; i < 4; i++){
    console.log(i)
}



let arr = [3,4,1]

// this is deprecated
// for each (el in arr){
//     console.log(el)
// }


for (el in arr){
    console.log(el)
}

arr.forEach(el => el)
console.log(arr.map(el => el+2) )

let bar = 3
while(bar === 3){
 console.log('help, im stuck in a loop')
 break   
} 

do {
    let vee = 'fee'
    console.log(vee)
} while (x === 4)


// Branching statements

while (true){
    console.log('Im in a loop')
    break
}


// while this may be somewhat common to see, I don't recommend nesting statements like this
// its a nightmare to maintain (especially without comments!)
for (let i = 0; i < 4; i++){
    for (let b = 0; b < 5; b++){
        if (x === 4){
            console.log(x)
        } else {
            break;
            // there is also the continue statement
            // it lets you go through your loop again
            continue
            // this completey stops the loop once reached
            return; 
            
        }
    }
}