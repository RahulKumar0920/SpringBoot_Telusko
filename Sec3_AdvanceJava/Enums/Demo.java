
enum Status{
    Running, Failed, Pending,Success;
    //All these status are stored with numbering, from left to right
    //Running : 0, Failed : 1, Pending : 2, Success : 3
}

enum Laptops{
    MacBook(2000), XPS(2200), Surface, ThinkPad(1200);

    //we can create variables, methods, constructors

    private int price;

    //Default constructor
    private Laptops(){
        price = 300;
    }

    private Laptops(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    
}


public class Demo{
    public static void main(String[] args){
        
        Status s = Status.Failed;
        System.out.println(s);

        
        //if-else with enum
        if(s == Status.Running)
            System.out.println("All good");
        else if(s == Status.Pending)
            System.out.println("Please Wait");
        else if(s == Status.Failed)
            System.out.println("Try Again");
        else
            System.out.println("Done!"); 

        //switch statment with enums
        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Failed:        
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Done!");
                break;
        }
        
        
        
        //Ordinal it prints the number at which the enum status are stored at
        System.out.println(s.ordinal());

        //".values()" this returns an array in which all the status are stored
        Status[] ss = Status.values();
        for(Status x : ss){
            System.out.println(x + " -> " + x.ordinal());
        }
        

        //enum -> Laptops
        Laptops lap = Laptops.MacBook;
        System.out.println(lap + " : " + lap.getPrice());
        
        for(Laptops laps : Laptops.values()){
            System.out.println(laps + " : "+ laps.getPrice());
        }

    }
}