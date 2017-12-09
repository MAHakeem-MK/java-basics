/**
 * Author : M A Hakeem MK
 * Date : 09/12/2017
 * Prime Number
 **/
import java.util.Scanner;

public class PrimeNumber {
    // method that return true if given value is prime,otherwise false
    public static boolean isPrime(int value) {
        /* counter keep track of number of modulo operation
           in prime number,the modulus returns 0 two times only
           1.when it is devided by 1
           2.when it is devided by it self 
        */
        int counter = 0;
        // zero , one is not prime
        if (value == 0 || value == 1) {
            counter = 0;
        } else {
            // starting from 2,doing modulus operation
            for(int i = 2;i<=value;i++){
                if (value%i==0) {
                    counter++;
                }
            }
        }
        // checking the counter,we done modulus starting from 2,so we don't have to consider 1st case
        // counter is one means the value is only devisible by it self(2nd case)
        if (counter==1) {
            return true;
        }
        // if the number is devisible by numbers other than one and the number it self,then it is not prime
        else{
            return false;
        }        
    }
    public static void main(String[] args) {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        System.out.println(PrimeNumber.isPrime(value)); 
    }
}