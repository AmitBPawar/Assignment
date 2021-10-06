import java.util.Scanner;
class A1
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Year  ");
  int x = sc.nextInt();
  if(x%4==0)
   {
    System.out.println("The year is leap"); 
   }  
   else
   {
    System.out.println("The year is not leap");
   }
 }
}