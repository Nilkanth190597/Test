import java.util.*;
class Reverse
{
 public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int arr[]=new int[5];
  for(int i=0;i<arr.length;i++)
  {
	  System.out.print("enter the number ["+i+"] :");
	  arr[i]=sc.nextInt();
  }
  for(int i=arr.length-1;i>=0;i--)
  {
  System.out.print(arr[i]);
  }
  }
}