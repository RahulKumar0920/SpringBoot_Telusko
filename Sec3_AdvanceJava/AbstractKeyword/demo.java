//To define an abstract method we need to define a abstract class
abstract class Car{

    //If we don't know what we have to define inside a method we can always just declare the method, we can only achieve this by defining a method as abstract
    public abstract void drive();
    public abstract  void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}


//if we are extending an abstract class we need to define the abstract method in the extended class 
//now if we dont want to define an abstract method in the extending class we need to make that class as a abastract aswell
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

//class which is not abstract class are called content class
class updatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class demo{
    public static void main(String[] args){

        //we cannot create a object of an abstract class : Car obj = new Car();

        Car obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}   