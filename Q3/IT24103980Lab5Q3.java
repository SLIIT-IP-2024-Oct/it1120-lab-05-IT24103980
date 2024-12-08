import java.util.Scanner;
public class IT24103980Lab5Q3{
 public static void main(String[]args){
  int startDate,endDate,num_days,total,dis;
  final int charge_per_day=48000;
  final int min_days_for_dis=3;
  final int max_month=32;
  final int dis_3_to_4=10;
  final int dis_5_to_more=20;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter start date(1-31) : ");
  startDate=input.nextInt();

  System.out.println("Enter end date(1-31) : ");
  endDate=input.nextInt();

  if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
   System.out.println("Dates must be betwee 1 and 31");
   return;

  }
  
  if(startDate>=endDate){

   System.out.println("Start date must be less than End date");
   return;
  }

  num_days = endDate-startDate;
  
  total=num_days*charge_per_day;

  dis=0;

  if(num_days>=3 && num_days<=4){
  
   dis = dis_3_to_4;

  }else if (num_days>=5){
   
   dis = dis_5_to_more;

  }


  double disAmount = total*dis/100.0;
  double finalAmount = total-disAmount;

  System.out.println("Room Charge per day: " +charge_per_day );
  System.out.println("Number of days reserved: " + num_days );
  System.out.println("Total amount to be paid: Rs " + finalAmount);

 }
}