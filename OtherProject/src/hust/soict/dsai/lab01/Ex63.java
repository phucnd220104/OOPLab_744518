package hust.soict.dsai.lab01;//Exercise 6.3
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number n:");
        n = keyboard.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        keyboard.close();
    }
}
