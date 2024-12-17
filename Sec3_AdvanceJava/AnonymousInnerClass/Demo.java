
class A{
    public void show(){
        System.out.println("Inside A->show");
    }    
}


public class Demo{
    public static void main(String[] args) {
        
        // Traditional ways to create object
        // A obj = new A();
        // obj.show();


        //Anonymous Inner Class 
        //If we want to declare a class only for once then we can define the method inside the class declaration
        A obj = new A(){
            public void show(){
                System.out.println("Inside obj->A->show");
            }
        };

        obj.show();

    }
}