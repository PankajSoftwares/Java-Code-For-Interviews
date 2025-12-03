/*
Armstrog Number: The number and Sum of its digit'Cubes is equal to the number is Armstrong Number.
 */

import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check for Armstrong.");
        int n = sc.nextInt();

        int t = n;
        int sum = 0;

        while(t != 0){
            int d = t % 10;
            sum += d*d*d;
            t /= 10;
        }
        System.out.println(sum == n ? n+ " is ArmstrongNum" : n+ " is Not ArmStrongNum");

    }
}