//2.Java Program to Count the Number of Occurrence of an Element in an Array
import java.util.Scanner;
public class Occurrence
{
    public static void main(String[] args) 
    {
      int num,elemnt,count=0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt();
      int a[] = new int[num];
      System.out.println("Enter all Elements:");
      for(int i=0;i<num;i++)
       {
          a[i] = input.nextInt();
       }
       System.out.println("Enter element of which want to count the occurrence:");
       elemnt = input.nextInt();
       for(int i = 0;i < num ; i++ )
        {
         if(a[i] == elemnt)
          {
           count++;
           }   
         }
        System.out.println("Number of occurrence of " + elemnt +" :"+count+"times");
    }
}