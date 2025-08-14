// Create list of persons
let persons = [
    { name: "vaishnav", age: 25, city: "Delhi" },
    { name: "Sara", age: 17, city: "Mumbai" },
    { name: "Mohan", age: 30, city: "Bangalore" },
    { name: "harsh", age: 16, city: "Chennai" },
    { name: "Raj", age: 19, city: "Lucknow" }
];

console.log("All persons:", persons);

// Filter eligible voters (age >= 18)
let eligibleVoters = persons.filter(person => person.age >= 18);
console.log("Eligible voters:", eligibleVoters);
