//Interface is used to create a module for the upcoming class to implement on its modules
//In interface by default all the methods are "public abstract"
interface A{
    //all the variable inside interface are by-default final and static
    int age = 42;
    void show();
    void config();
}

interface X{
    void run();
}

//we can also inherit one interface into another interface
interface Y extends X{

}


//to use/inherit "interface A" we use the keyword "_className implements _interfaceName"
//If we don't implement the interface than automatically this class will become an abstract class
//we can implement multiple interfaces in one class
class B implements A,Y{
    public void show(){
        System.out.println("Inside Show");
    }

    public void config(){
        System.out.println("Inside Config");
    }

    public void run(){
        System.out.println("Inside Run");
    }
}


public class demo{
    public static void main(String[] args) {
        
        //by default we cannot define an object for interface obj = new A();
        A obj = new B();
        
        obj.show();
        obj.config();

        X newObj = new B();

        newObj.run();


        //For variable we can print them directly using the interface name and variable name
        System.out.println(A.age);

        //But we cannot change the vlaue of the variable because they are final
        // A.age = 30; 
    }
}