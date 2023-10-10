import java.util.Scanner;

public class pttrn4 {
       public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     int i,j;
     System.out.println("enter the no.");
       int n= scanner.nextInt();
     for(i=0;i<=n ; i++){
        for(j=1;j<=n;j++)
        {
            
        System.out.print("  ");

        }
        for(j=1;j<=n;j++)
        {

        System.out.print("*");

        }
         System.out.println("");
          }
 scanner.close();
}
    
}
