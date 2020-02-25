import java.util.Scanner;

public class Calculator {
    public static int add(int... numbers)
    {
        int sum = 0;

        for(int i = 0; i < numbers.length;i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static  int Multiplication(int... numbers)
    {
        int product = 1;

        for(int i = 0; i < numbers.length;i++){
            product *= numbers[i];
        }
        return product;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many numbers are you working with.");
        int size = Integer.parseInt(sc.nextLine());
        int[] num = new int[size];

        System.out.println("Enter "+ size +" numbers to add and multiply.");

        for (int i = 0;i < num.length; i++){
            num[i] = sc.nextInt();
        }


        System.out.println("Addition");
        System.out.print("Sum = " + Calculator.add(num));
        System.out.println(" \n  ");
        System.out.println("Multiplication");
        System.out.print("Product = " + Calculator.Multiplication(num));
        System.out.println(" \n  ");
    }
}
