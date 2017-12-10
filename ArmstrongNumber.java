/**
 * ArmstrongNumber
 * Author : M A Hakeem MK
 * Date : 10/12/2017
 */
public class ArmstrongNumber {
    public boolean isArmstrong(int value) {
        int temp = value;
        int digit;
        int sum = 0;
        while (temp>0) {
            digit = temp % 10;
            sum += (digit*digit*digit); 
            temp = temp/10;   
        }

        if (sum==value) {
            return true;
        } else {
            return false;
        }
        
    }
    public void generateSeries(int lowerBound,int upperBound) {
        for(int i = lowerBound;i<=upperBound;i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.generateSeries(100, 400);
    }
}