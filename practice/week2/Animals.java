import java.util.ArrayList;

class Animal{
    protected String name;
    
    Animal (String name){
        this.name = name;
    }

    public void speak(){
        System.out.println(name +"makes a sound");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override 
    public void speak(){
        System.out.println(name + " says Woof");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    @Override 
    public void speak(){
        System.out.println(name + " Says Meow");
    }
}
public class Animals {
    public static void main(String[] args){
        //Animal a = new Dog("Rex");
        //a.speak();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bingo"));
        animals.add(new Cat("Rinky"));
        animals.add(new Animal("Generic"));
        for (Animal a : animals) {
    a.speak();
}
    }

}
