import java.util.Scanner;

public class Reverse_number {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = scanner.nextInt();
        scanner.close();
        int remainder,reverse = 0;
        while (n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n /=10;


        }
        System.out.println("Reversed Number:"+reverse);
    
}
}
