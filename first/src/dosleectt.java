import java.util.*;
 
public class dosleectt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1) {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < 0) {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
 
        in.close();
 
        int eve = 0;
        int odd = 0;
 
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                eve = eve + arr[i];
            } else {
                odd = odd + arr[i];
            }
        }
 
        int[] sums = {eve, odd};
        System.out.println(maximumSum(sums, 2));
    }
 
    public static int maximumSum(int numbers[], int size) {
        int max = numbers[0];
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}








//import java.util.Scanner;
//
//public class dosleectt {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a;
//        a = in.nextInt();
//        if (a < 0) {
//            System.out.println("Invalid array size");
//        }
//
//        int[] b = new int[a];
//        for (int i = 0; i < a; i++) {
//            b[i] = in.nextInt();
//            if (b[i] < 0) {
//                System.out.println("Invalid input");
//                return;
//            }
//        }
//        System.out.println(maximumSum(b, a));
//        in.close();
//    }
//
//    public static int maximumSum(int numbers[], int size) {
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i = 0; i < size; i++) {
//            if (numbers[i] % 2 == 0) {
//                evenSum += numbers[i];
//            } else {
//                oddSum += numbers[i];
//            }
//        }
//        return Math.max(evenSum, oddSum);
//    }
//}
