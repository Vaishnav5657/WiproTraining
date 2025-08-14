// A generic function that takes two values of any type and returns them as a tuple
function pair(first, second) {
    return [first, second];
}
var numStrPair = pair(101, "Vaishnav");
var boolNumPair = pair(true, 500);
console.log(numStrPair);
console.log(boolNumPair);
