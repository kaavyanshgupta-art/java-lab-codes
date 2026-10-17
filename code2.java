import java.util.Scanner;

public class code2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = scanner.nextInt();
        scanner.close();
        for(int i = 0; i<=n;i++){
        if(i % 2 ==0){
            System.out.println(i);
        }
    
}}
} 