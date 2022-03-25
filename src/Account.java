

import java.util.Scanner;


public  class Account
{
    public int account_number;
    public String name;
    public String acc_type;
    private long phone;

    Account(int account_number,String name,String acc_type,long  phone)
    {
        this.account_number=account_number;
        this.name=name;
        this.acc_type=acc_type;
        this.phone =phone;
    }
    public void get_phone()
    {
        System.out.println("Your current phone number is: "+ phone);
    }
    public void set_phone()
    {
        System.out.println("enter phone number");
        Scanner sc= new Scanner (System.in) ;
        long  d=sc.nextLong();
        this.phone=d;
    }

}

