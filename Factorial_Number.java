import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = scanner.nextInt();
        scanner.close();
        if(n<0){
            System.out.println("NOt Defined ");}
            else{ long factorial = 1;
                for (int i = 1;i<=n;i++){
                    factorial*= i;
                }
                System.out.println("The Factorial of " +n+ " is " +factorial);
            }
    }

    
}
