
@FunctionalInterface
interface A {

    void show(int i);

}

/* Normal Implemetation to instantiate method inside interface
class B implements A{
    public void show(){
        System.out.println("In Show");
    }
}
 */
interface B {

    int add(int i, int j);

}

public class Demo {

    public static void main(String[] args) {
        // A obj = new B();

        //Anonymous Inner class 
        /*
        A obj = new A() {
            public void show() {
                System.out.println("Inside Show");
            }
        };
         */
        //Lamda Expression
        // A obj = () -> System.out.println("Inside Show");
        // A obj = (int i) -> System.out.println("Inside Show " + i);
        A obj = i -> System.out.println("Inside Show " + i);

        //Lamda Expression with returnType
        /*
        B obj1 = new B() {
            public int add(int i, int j) {
                return i + j;
            }
        };
         */
        // B obj1 = (int i, int j) -> { return i + j; };
        B obj1 = (i, j) -> i + j;
        
        
        
        obj.show(5);

        int result = obj1.add(5, 4);
        System.out.println(result);

    }
}
