//5.Read a matrix from the console and check whether it is symmetric or not.
import java.util.Scanner;
class SymmetricMatrix{
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("Number of rows of Matrix:");
       int m = input.nextInt();
       System.out.println("Number of columns of Matrix:");
       int n = input.nextInt();
       int  a[][] = new int[m][n];
       System.out.println("Enter elements of The Matrix:");
       for(int i =0;i < m;i++){
           for(int j = 0;j<n;j++){
               a[i][j] = input.nextInt();
           }
       }
       if(m != n)
          System.out.println("Matrix is not a Squre matrix");
       else{
          int b[][] = new int[n][m];
          for(int i=0; i < n; i++){
              for(int j = 0;j < m; j++){
                  b[i][j] = a[j][i];
               }
           }
          int flag =0;
          first:
          for(int i =0; i < n; i++){
             for(int j = 0; j < m;j++){
                 if(a[i][j] != b[i][j]){
                     flag =1;
                     break first;
                  }
              }
          }
          if(flag == 1)
              System.out.println("Matrix is not Symmetric");
          else
              System.out.println("Matrix is Symmetric"); 
       }
   }
}