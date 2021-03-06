console.log("this script works")

//Rock, Paper, Scissors game


// declaring hand variables and assigning them values
let hand1 = "Paper"
let hand2 = "Scissors"

// declaring win condition states as arrow functions
let hand1Win = () => console.log(`${hand1} beats ${hand2}, Hand 1 wins`)
let hand2Win = () => console.log(`${hand2} beats ${hand1}, Hand 2 wins`)


// if else block with win condition and else statement 
// this block also immediately checks if the two hands are the same value, resulting in a draw
if (hand1 === hand2) {
    console.log(`${hand1} and ${hand2} are the same! It's a draw!`)
} else if (hand1 === "Rock" && hand2 === "Paper") {
    hand1Win()
} else if (hand1 === "Scissors" && hand2 === "Paper") {
    hand1Win()
} else if (hand1 === "Paper" && hand2 === "Scissors") {
    hand2Win()
} else if (hand1 === "Scissors" && hand2 === "Rock") {
    hand2Win()
} else if (hand1 === "Paper" && hand2 === "Rock") {
    hand1Win()
} else {
    console.log("I didn't understand that.")
}


