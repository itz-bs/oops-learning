package Final;

interface animal_ {
    void sound();
}

class Dog implements animal_ {
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat implements animal_ {
    public void sound() {
        System.out.println("cat meows");
    }
}

public class Main_ {
    public static void main(String[] args) {
        animal_ dog = new Dog();
        dog.sound();
        animal_ Cat = new Cat();
        Cat.sound();
    }
}

