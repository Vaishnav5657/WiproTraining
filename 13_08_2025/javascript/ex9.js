// Person list from Ex7
let persons = [
    { name: "John", age: 25 },
    { name: "Sara", age: 17 },
    { name: "Mike", age: 30 },
    { name: "Emma", age: 15 }
];

console.log("Before adding status:", persons);

// Add 'status' property based on age
persons.forEach(person => {
    person.status = (person.age >= 18) ? "Adult" : "Minor";
});

console.log("After adding status:", persons);
