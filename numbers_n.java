import java.util.Scanner;
public class numbers_n{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = scanner.nextInt();
        scanner.close();
            for(int i = 1;  i<=n; i++){
                System.out.println(i);
            }        

    }
}