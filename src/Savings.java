import java.util.Scanner;

public class Savings extends Account implements Inter,Runnable {
    Scanner sc = new Scanner(System.in);
    public void run()
    {




    }
    private int balance;

    Savings(int x, String name, String type, int i, long phone) {
        super(x, name, type, phone);
        this.balance = i;
    }

    public void withdraw() {

        System.out.println("Enter the amount to withdraw: ");
        int d = sc.nextInt();
        balance += (0.25 * d);
        balance -= d;
        System.out.println("Balance is " + balance);
    }

    public void get_balance() {
        System.out.println("Balance is " + balance);
        ;
    }

    public void deposit() {
        String d;
        int b;
        int count = 0;
        except:
        while (true) {
            try {
                System.out.println("Enter the amount to deposit: ");
                d = sc.next();
                b = Integer.parseInt(d);
                break except;

            } catch (NumberFormatException e) {

                System.out.println("wrong input given: ");
                count++;
                if (count == 3) {
                    System.out.println(" limit Exceeded ");
                    System.exit(1);
                }

            }

        }
        balance =balance -b;
        System.out.println("Balance is " + balance);
    }

}
