// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Dog dan memanggil method pada parent class
        Dog dog = new Dog("Lucky", 3);
        dog.eat();
        dog.sleep();
        
        // Memanggil method yang hanya ada pada child class
        dog.bark();
        
        // Membuat objek Cat dan memanggil method pada parent class
        Cat cat = new Cat("Kitty", 2);
        cat.eat();
        cat.sleep();
        
        // Memanggil method yang hanya ada pada child class
        cat.meow();
    }
}