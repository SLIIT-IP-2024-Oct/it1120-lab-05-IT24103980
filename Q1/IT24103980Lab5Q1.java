import java.util.Scanner;
public class IT24103980Lab5Q1{
 public static void main(String[]args){
  
  int num1,num2,num3,max,min;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter the first integer: ");
  num1=input.nextInt();

  System.out.println("Enter the second integer: ");
  num2=input.nextInt();

  System.out.println("Enter the third integer: ");
  num3=input.nextInt();

  min=num1;

  if(num2<min){
   min=num2;
  }

  if(num3<min){
   min=num3;
  }


  max=num1;

  if(num2>max){
   max=num2;
  }

  if(num3>max){
   max=num3;
  }

  System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
  System.out.println("The Smallest number is: "+min);
  System.out.println("The largest number is: "+max);

 }
}