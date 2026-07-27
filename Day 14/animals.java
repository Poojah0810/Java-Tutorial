package OOPS_Day_3;
abstract class Animal {
    abstract public void makesound();
    void makingsound(){
        System.out.println("Animal making sound");
    }
}
class dog extends Animal {
    public void makesound(){
        System.out.println("bow bow ");
    }
}
class cat extends Animal {
    public void makesound(){
        System.out.println("meow meow");
    }
}
public class animals{
    public static void main(String[] args) {
        Animal dog = new dog();
        Animal cat = new cat();
        dog.makesound();
        cat.makesound();
    }
}