// Child class Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    
    public void bark() {
        System.out.println(name + " is barking.");
    }
}