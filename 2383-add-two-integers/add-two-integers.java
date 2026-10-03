import java.util.*;

class Solution {
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int n2 = sc.nextInt();
        System.out.print(sum(n1,n2));
        sc.close();
    }
}