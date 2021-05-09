import java.util.*;
class Swap
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.print("enter the first number  a:");
	 int a=sc.nextInt();
	 
	 System.out.print("enter the first number  b:");
	 int b=sc.nextInt();
 
 System.out.println("Swap a Number Before :- a:"+a+" b:"+b);
 a=a+b;
 b=a-b;
 a=a-b;
 System.out.println("Swap a Number After :- a:"+a+" b:"+b);
 
 }
}