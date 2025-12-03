import java.util.*;

class SwapTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers a and b: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("Before Swapping of numbers: a="+a+", b="+b);
        //Without using third varible
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After swapping of numbers: a="+a+", b="+b);

        // here is usin 3rd varible temp
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After double swapping of numbers using the third varible: a="+a+", b="+b);

    }
}