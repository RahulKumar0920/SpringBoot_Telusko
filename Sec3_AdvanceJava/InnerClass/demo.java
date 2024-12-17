//class
//we cannot define static class as main class 
class A{
    int age;

    public void show(){
        System.out.println("Inside show");
    }

    //we can make inner class as static class
    static class B{
        public void config(){
            System.out.println("Inside config");
        }
    }
}


public class demo{
    public static void main(String[] args){

        A obj = new A();
        obj.show();
        // A.B newObj = obj.new B(); -> if class B is non-static
        A.B newObj = new A.B();
        newObj.config();
    }
}