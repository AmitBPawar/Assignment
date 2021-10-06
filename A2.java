import java.util.Scanner;
class A2
{
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the salary");
   int salary = sc.nextInt();
   int x= 12 * salary;
   if(x>0 && x<250000)
   {
     System.out.print("No tax");
   }
   else if(x>250000 && x<500000)
   {
      x = x-250000;
      double Tax = x *0.1;
     System.out.print(Tax);
    }
    else if(x>500000 && x<1000000)
    {
      int y = x-250000;
      double z = y - 250000;
      z = z * 0.2;
      z = z + 25000;
     System.out.println(z);
    }
    else if(x>1000000)
    {
      double y = x-100000;
       y = y * 0.3;
       y = y + 125000;
      System.out.println(y);
    }
  }
}