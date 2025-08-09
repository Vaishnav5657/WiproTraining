package com.wipro.oop;

class Human extends Animal {
    Human(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Hello!");
    }
}
