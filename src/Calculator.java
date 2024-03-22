import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int n1, n2, select;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number: ");;
        n1= scanner.nextInt();
        System.out.print("Enter the second number: ");
        n2= scanner.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Please select:");
        select= scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition:" + (n1+n2));
                break;
            case 2:
                System.out.println("Substraction: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Multipication: "+ (n1*n2));
                break;
            case 4:
                if (n2!= 0){
                    System.out.println("Division: "+ (n1/n2));
                } else {
                    System.out.println("a number cannot be divided by 0!");
                }
                break;
            default:
                System.out.println("You have logged in incorrectly.");
        }
    }
}