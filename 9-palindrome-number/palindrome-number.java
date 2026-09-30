import java.util.*;;

class Solution {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int reversX = 0;
        int lastDigit;
        while(temp != 0){
           lastDigit  = temp%10;
            reversX = reversX*10+lastDigit;
            temp/=10;

        }
        if(x!=reversX || x<0){
            return false;
        }
        else{
            return true;
        }

    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));
        sc.close();
    }
}