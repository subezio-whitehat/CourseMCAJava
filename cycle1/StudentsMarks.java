//1.Java Program to Accept the Marks of a Student into a 1D Array and find total marks and percentage
import java.util.Scanner;
class StudentsMarks
{
 public static void main(String args[])
 {
  int number,total=0;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of Subjects:");
  number = input.nextInt();
  int a[] = new int[number];
  System.out.println("Enter Marks Of Each:");
  for(int i = 0;i < number; i++)
  {
   a[i] = input.nextInt();
   total = total + a[i];
  }
  System.out.println("Total Mark = "+total);

  System.out.println("Percentage  = "+total/number+"%");
  
 } 
}