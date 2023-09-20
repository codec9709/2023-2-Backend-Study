package Week1;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void shout() {
        System.out.println(this.getName() + "says Meow!");
    }
}

    class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        public void shout() {
            System.out.println(this.getName() + "says Woof!");
        }
    }
class Main {
    public static void main(String[] args){
        Cat cat = new Cat("cat ");
        Dog dog = new Dog("dog ");

        cat.shout();
        dog.shout();
    }
}


