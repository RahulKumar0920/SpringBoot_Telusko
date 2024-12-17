class A{
    public void showTheDataWhichBelongsToThisCalss(){
        System.out.println("In A show");
    }
}

class B extends A{ 
    @Override //Helps you to tell the compiler that we want to override the class A method and run the method in B class, hence it will provide you with the mistaked that might cause the bug.
    public void showTheDataWhichBelongsToThisCalss(){
        System.out.println("In B show");}
}

public class Demo{
    public static void main(String[] args){
        B obj = new B();
        obj.showTheDataWhichBelongsToThisCalss();
    }
}