class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Run {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Outputs: Animal makes a sound
        myDog.makeSound(); // Outputs: Dog barks
        myCat.makeSound(); // Outputs: Cat meows

        // Demonstrating polymorphism
        Animal animal;
        
        animal = new Dog();
        animal.makeSound(); // Outputs: Dog barks
        
        animal = new Cat();
        animal.makeSound(); // Outputs: Cat meows
    }
}
