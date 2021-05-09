import java.util.*;
class Arg
{
 public static void main(String args[])
  {
   int i,j,k;
   Scanner sc=new Scanner(System.in);
   i=Integer.parseInt(args[0]);
   j=Integer.parseInt(args[1]);
   k=i+j;
   System.out.print("Addition of two numbers is :"+k);
  }
}