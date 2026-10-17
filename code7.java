 import java.util.Scanner;
 public class code7 {
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int temp =Math.abs(n);
        while(temp>0){
            int digit = temp % 10;
            sum += digit;
            temp/=10;
        }
        System.out.println("The sum of digits is : "+ sum);

 }
}


   
