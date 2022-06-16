package classWork;

import java.util.Scanner;

public class MaxNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter num1 ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2 ");
        int num2 = scanner.nextInt();

        System.out.println("Enter num3 ");
        int num3 = scanner.nextInt();

        //step-1

        if (((num1 - num2) < 0) && ((num1 - num2) < num3)) {
            if(num1 < num2){
                System.out.println(num1);
            }else System.out.println(num2);
        }

    }
}
