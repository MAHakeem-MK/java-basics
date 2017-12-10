/**
 * FibonacciSeries
 * Author : M A Hakeem MK
 * Date : 10/12/2017
 */ 
public class FibonacciSeries {

    public void generate(int limit) {
        int num1,num2,num3;
        num1 = 0;
        num2 = 1;
        System.out.print(num1+" "+num2);
        for(int i=2;i<=limit;i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+num3);
        }
    }
    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        series.generate(10);
    }
}