package calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator ----->");

        System.out.println("Operations Available : \n1. Add\n2. Subtract\n3. Multiply");
        System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication");
        System.out.println("Enter your Choice : ");
        int x = sc.nextInt();

        System.out.println("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Addition is : " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction is : " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication is : " + (a * b));
                    break;
            }

        }
    }
