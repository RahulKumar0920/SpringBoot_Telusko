//If we are try to pass a specific "variable" , this will only work for specific conditions
//We can pass a variable which becomes the superset for all the variables passed

abstract class Computer{
    public abstract void code();
}

class Laptop extends Computer
{
    public void code(){
        System.out.println("Code , Compile , Run!");
    }
}

class Desktop extends Computer
{
    public void code(){
        System.out.println("Code , Compile , Run! : Faster");
    }
}

class Developer{
    public void devApp(Computer comp){ //This is called tight coupling 
        comp.code();
    }
}

public class demo{
    public static void main(String[] args) {
        
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        
        Developer r = new Developer();
        
        // r.devApp(desk); this will be wrong as we tried to pass Laptop specifically to the method
        r.devApp(lap);
        r.devApp(desk);
    }
}