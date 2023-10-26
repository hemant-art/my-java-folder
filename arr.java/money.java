import java.util.Scanner;
public class money
{
    int bal;
    int paw;
     void deposite()
    {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("wellcome");
            System.out.println("enter your passcode");
        
            paw=sc.nextInt();
            if(paw==1234)
            {
                System.out.println("enter your amount");
                int amt=sc.nextInt();
                amt=amt+bal;
                System.out.println(amt);
                 
                
            }

    }
        
    void withdrwl()
    {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("wellcome");
            System.out.println("enter your passcode");
        
            paw=sc.nextInt();
            if(paw==1234)
            {
                System.out.println("enter your amount");
                int amt=sc.nextInt();
                amt=amt-bal;
                System.out.println(amt);
                 
                
            }

    }
    public void checkbal()
    {
            bal=10;
            Scanner sc=new Scanner(System.in);
            System.out.println("wellcome");
            System.out.println("enter your passcode");
        
            paw=sc.nextInt();
            if(paw==1234)
            {
                System.out.println("your baalance is"+bal);
                 
                
            }

    }

   
        public static void main(String []args)
        {
            
            Scanner sc2=new Scanner(System.in);
            money n=new money();
            while(true)
            {
            System.out.println("enter 1 for deposite");
            System.out.println("enter 2 for withdrwl");
            System.out.println("enter 3 for checkbal");
            int op=sc2.nextInt();
            switch(op)
            {
                case 1:n.deposite();
                System.out.println("visit again");     
                        break;
                case 2:n.withdrwl();
                System.out.println("visit again");     
            
                        break;
                 case 3:n.checkbal();
                 System.out.println("visit again");     
                        break;
                
                default:System.out.println("try again");        
            
            }
            if(op==4)
            {
                System.out.println("thank you!");
            }  
            }
        }
    }
