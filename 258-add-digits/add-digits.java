import java.util.*;

class Solution {
    public static int addDigits(int num) {
        while (num >= 10) {          // keep going until 1 digit is left
            int sum = 0;
            while (num != 0) {
                sum += num % 10;     // take last digit
                num /= 10;           // remove last digit
            }
            num = sum;               // the sum becomes the new number
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(addDigits(num));
        sc.close();
    }
}