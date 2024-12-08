import java.util.Scanner;
public class IT24103980Lab5Q2{
 public static void main(String[]args){
  int members;
  String prize=" ";

  Scanner input=new Scanner(System.in);

  System.out.println("Enter the number of new members introduced: ");
  members=input.nextInt();

  if(members<0){
   System.out.println("Input must be a number 0 or greater");
  }

  else{

   switch(members){

    case 0:
   
     prize="No prize";
     break;

    case 1:

     prize="Pen";
     break;

    case 2:

     prize="Umbrella";
     break;

    case 3:
  
     prize="Bag";
     break;

    case 4:

     prize="Travelling Chair";
     break;

    case 5:

     prize="Headphone";
     break;
  }

   System.out.println("Prize is : "+prize);
  }

 }
}