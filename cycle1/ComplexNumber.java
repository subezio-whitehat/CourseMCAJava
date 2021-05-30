//4.Add two complex numbers.
import java.util.Scanner;
class ComplexNumber{
     double real,img;
   ComplexNumber(double r,double i){
       this.real = r;
       this.img = i;  
     }
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
     ComplexNumber temp = new ComplexNumber(0,0);
     temp.real = c1.real + c2.real;
     temp.img = c1.img + c2.img;
     return temp;
    }

   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter real part of first number:");
       float n1 = input.nextFloat();
       System.out.println("Enter imaginary part of first number:");
       float n2 = input.nextFloat();
       System.out.println("Enter real part of Second number:");
       float n3 = input.nextFloat();
       System.out.println("Enter imaginary part of Second number:");
       float n4 = input.nextFloat();
       ComplexNumber c1 = new ComplexNumber(n1,n2);
       ComplexNumber c2 = new ComplexNumber(n3,n4);
       ComplexNumber temp = sum(c1,c2);
       System.out.println("Sum is :"+temp.real+ " + "+temp.img+" i" ); 
  }
}
