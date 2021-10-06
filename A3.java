import java.util.Scanner;
class A3
 {
   public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the category for Domestic 1 commercial 2 and Industrial 3");
  int i = sc.nextInt();
  System.out.println("Enter CMR");
   int CMR = sc.nextInt();
  System.out.println("Enter PMR");
   int PMR = sc.nextInt();
   double BU = CMR - PMR;
  switch(i)
  {
case 1:
 if(BU>0 && BU<100)
 {
    System.out.println(BU);
    
 }
   else if(BU>100 && BU<200)
 {
     BU = BU - 100;
     BU = BU * 2;
     BU  = 100 + BU;
     System.out.println(BU);
 }

   else if(BU>200)
   {
      BU = BU - 200;
      BU = BU * 3;
      BU = BU + 300;
      System.out.println(BU);
    
   }
case 2:
   if(BU>0 && BU<100)
   {
    BU = BU *2;
    System.out.println(BU);
   }
 
   else if(BU>100 && BU<200)
   {
     BU = BU - 100;
     BU = BU * 4;
     BU  = 200 + BU;
     System.out.println(BU);
   }
   
   else if(BU>200)
   {
      BU = BU - 200;
      BU = BU * 6;
      BU = BU + 600;
      System.out.println(BU);
      
   }

       case 3:
   if(BU>0 && BU<100)
   {
    BU = BU * 3;
    System.out.println(BU);
   }
 
   else if(BU>100 && BU<200)
   {
     BU = BU - 100;
     BU = BU * 6;
     BU  = 300 + BU;
     System.out.println(BU);
   }
 
   else if(BU>200)
   {
      BU = BU - 200;
      BU = BU * 9;
      BU = BU + 900;
      System.out.println(BU);
      
   }
 }
 }
}