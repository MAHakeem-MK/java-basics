/**
 * Author : M A Hakeem MK
 * Date : 09/12/2017
 * Factorial
 */
import java.util.Scanner;

public class FactorialNumber {
    // static method to calculate factorial of a number.
    public static int calculate(int value) {
        if(value==1) return 1;
        return calculate(value-1) * value;
    }
    // main method.
    public static void main(String[] args) {
        // object to receive input from user through console
        Scanner sc = new Scanner(System.in);
        // declaration of essential datas.
        int value = 0;
        int factorial = 0;
        // prompt to user
        System.out.println("Enter a number to calculate factorial:");
        // read number
        value = sc.nextInt();
        // calculate
        factorial = FactorialNumber.calculate(value);
        // display result
        System.out.println("factorial of " + value + " = " + factorial);
    }   
}       
