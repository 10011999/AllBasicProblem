package com.bridgelabz;

public class Animal {
    public void eat() {
        System.out.println("Time is eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat");
    }

    public void run() {
        System.out.println("Animal run");
    }

    public void jump() {
        System.out.println("Animal Jump");
    }

    public void display() {
        super.eat();
        this.jump();
        this.eat();
    }
}

class Cat extends Dog {
    public void eat() {
        System.out.println("Cat eat");
    }

    public void run() {
        System.out.println("Cat run");
    }

    public void jump() {
        System.out.println("Cat Jump");
    }

    public void display() {
        super.eat();
        super.run();
        this.eat();
        eat();
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();

        System.out.println("=================");
        Cat cat = new Cat();
        cat.display();
    }
}