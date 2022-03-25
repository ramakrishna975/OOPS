import java.util.Scanner;
import java.io.IOException;

public  class Current extends Account implements Inter,Runnable
{
    private int balance;
    public void run()
    {

    }
    Current(int x, String name, String type, int i,long  phone)
    {
        super(x,name,type,phone);
        this.balance=i;
    }
    public void withdraw()
    {
        Scanner sc= new Scanner (System.in) ;
        System.out.println("Enter the amount to withdraw: ");
        int d=sc.nextInt();
        balance -=d;
        System.out.println("Balance is "+ balance);
    }
    public void  get_balance()
    {
        System.out.println("Balance is "+ balance);;
    }
    public void deposit()
    {
        String d;
        int b;
        int count=0;
        Scanner sc= new Scanner (System.in) ;
        except:
        while(true) {
            try {
                System.out.println("Enter the amount to deposit: ");
                d = sc.next();
                b = Integer.parseInt(d);
                break except;

            }
            catch (NumberFormatException e) {

                System.out.println("wrong input given: ");
                count++;
                if (count==3)
                {
                    System.out.println("Exceeded limit ");
                    System.exit(1);
                }

            }
        }
        balance = balance + b;
        System.out.println("Balance is " + balance);
    }

}