public class Inheritance{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();

        dog dobby = new dog();
        dobby.legs=3;
        System.out.println(dobby.legs);

        bird sparrow = new bird();
        sparrow.fly();
        sparrow.breathe();

        dobby.eat();

    }
}
//base class
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
//multi level inheritance
class mammal extends Animal{
    int legs;
}
class dog extends mammal{
    String breed;
}

//hierarchial 
class bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

//hybrid: when multilevel + hierarchial 
// ex: fish extends animal, mammals extends animal , dog extends mammals

//multiple inheritance: when class c extends both classes a & b

 
