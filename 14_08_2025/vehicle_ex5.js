// Base class
class Vehicle {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    getInfo() {
        return `${this.year} ${this.make} ${this.model}`;
    }
}

// Subclass
class Car extends Vehicle {
    constructor(make, model, year, numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    getInfo() {
        return `${super.getInfo()} - ${this.numDoors} doors`;
    }
}

let myCar = new Car("Mahindra", "Xuv700", 2020, 4);
console.log(myCar.getInfo()); 
