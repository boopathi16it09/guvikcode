import.java.util.*;
public class Uber
{
    static void display(int str,int end,String type,int price)
    {
        System.out.println("Uber cab service!!!");
        System.out.println("Starting kilometer:"+str);
        System.out.println("Ending kilometer:"+end);
        int dis=end-str;
        System.out,println("Travelling distance:"+dis);
        System.out,println("Price per kilometer:"+price*dis);
    
    }
    public static void main(string[] args)
    {
        Scanner in=new scanner(system.in);
        System.out.println("SELECT THE TYPE OF VEHICLE:");
        System.out.println("1.CAR");
        System.out.println("2.AUTO");
        System.out.println("3.OMINI");
        System.out.println("4.SHARE AUTO");
        int opn=in.nextint();
        int price=0,start=0,end=0,distance=0;
        swtich (opn)
        {
            case 1:
                System.out.println("enter the starting kilometer:");
                start=in.nextint();
                System.out.println("enter the ending kilometer:");
                end=in.nextint();
                price=20;
                distance=end-start;
                display(start,end,"CAR",price);
                break;
            case 2:
                System.out.println("enter the starting kilometer:");
                start=in.nextint();
                System.out.println("enter the ending kilometer:");
                end=in.nextint();
                price=15;
                distance=end-start;
                display(start,end,"AUTO",price);
                break;
            case 3:
                System.out.println("enter the starting kilometer:");
                start=in.nextint();
                System.out.println("enter the ending kilometer:");
                end=in.nextint();
                price=12;
                distance=end-start;
                display(start,end,"OMINI",price);
                break;
            case 4:
                System.out.println("enter the starting kilometer:");
                start=in.nextint();
                System.out.println("enter the ending kilometer:");
                end=in.nextint();
                price=10;
                distance=end-start;
                display(start,end,"SHARE AUTO",price);
                break;
                default;
                System.out.println("invalid vehicle");
                
                
        }
    }    
        
        
    }
}
