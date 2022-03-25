import java.util.Scanner;
class Test2 implements Runnable{

    public void run()
    {
        Scanner sc = new Scanner(System.in);
        Savings r2=new Savings(1,"sai","savings",20000,9898881292l);
        System.out.println("Savings Account : \n Enter 1. for deposit \n 2. for withdraw \n 3. for balance enquiry \n 4. for change phone number:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                r2.deposit();
                break;
            }
            case 2: {
                r2.withdraw();
                break;
            }
            case 3: {
                r2.get_balance();
                break;
            }
            case 4: {
                r2.get_phone();
                r2.set_phone();
                break;
            }
        }
    }
}

class Test1 implements Runnable{

    public void run() {
        Scanner sc = new Scanner(System.in);

        Current r1 = new Current(12, "ram", "current", 23000, 9126886541l);

        System.out.println("Current Account:  \n Enter 1. for deposit \n 2. for withdraw \n 3. for balance enquiry \n 4. for change phone number: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                r1.deposit();
                break;
            }
            case 2: {
                r1.withdraw();
                break;
            }
            case 3: {
                r1.get_balance();
                break;
            }
            case 4: {
                r1.get_phone();
                r1.set_phone();
                break;
            }
        }
    }
}

public class Main {


    public static void main(String args[])
    {


        Test1 e1 =new Test1();
        Test2 e2 =new Test2();

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        t1.start();
        t2.start();
     try {
         t1.join();
          t2.join();
          }
     catch(Exception e){}
  /////  System.out.println(t1.isAlive());
   System.out.println("Transaction Successful");
    }
}
