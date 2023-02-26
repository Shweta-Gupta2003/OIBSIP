import java.util.*;

class choice
{
int userid,userpin;


void Transaction()
{
System.out.println("Your Heartfully Welcome, to My ATM Machine");
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your ID:");
userid=sc.nextInt();
System.out.println("Please enter your PIN number:");
userpin=sc.nextInt();

System.out.println("User ID:"+userid);

System.out.println("PIN NO:"+userpin);

System.out.println("Login Sucessfully!!");
}
}

class ATM
{
int inbal=5000,amt;

void initialbalance()
{
System.out.println("Your initial balance is :"+inbal);
}
}


class Deposit extends ATM
{
void dep()
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your amount to be deposited:");
amt=sc.nextInt();
inbal=inbal+amt;
}

}


class Withdraw extends Deposit
{
void with()
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your amount to be withdrawn:");
amt=sc.nextInt();
inbal=inbal-amt;
}
}

class Display extends Withdraw
{
void disp()
{
System.out.println("Your Balance after transaction is "+inbal);
}

}


class Bank
{
public static void main(String args[])
{
int inbal=5000;
choice c=new choice();
c.Transaction();
Display dis=new Display();
int tran;
while(true)
{
System.out.println("Please enter the type of Transaction to  be performed:");
System.out.println("1.Transaction History");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Transfer");
System.out.println("5.Exit");
Scanner sc=new Scanner(System.in);
tran=sc.nextInt();
switch(tran)
{
case 1:dis.initialbalance();
       break;

case 2:
       dis.dep();
       break;

case 3:
       dis.with();
       break;

case 4:
      dis.disp();
      break;

case 5:System.exit(0);
       break;
}
}
}
}



