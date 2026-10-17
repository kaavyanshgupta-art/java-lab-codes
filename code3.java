import java.util.Scanner;

public class code3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum += i;
        }
        System.out.print(sum);


    
}
}
