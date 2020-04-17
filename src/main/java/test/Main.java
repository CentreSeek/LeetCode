package test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: LeetCode
 * @description:
 * @author: CentreS
 * @create: 2020-03-16 16:25:36
 **/
public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        float[] arr = new float[1001];
        int a = 0;
        int b = 0;
        int c = 0;
        int tem;
        sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            tem = sc.nextInt();
            arr[tem] += sc.nextFloat();
        }
        b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            tem = sc.nextInt();
            arr[tem] += sc.nextFloat();
        }
        sc.close();
        for (int i = 0; i < 1001; i++) {
            if (arr[i] != 0) {
                c++;
            }
        }
        System.out.print(c);
        for (int i = 1000; i >=0; i--) {
            if (arr[i] != 0.0) {
                System.out.format(" %d %.1f", i,arr[i]);
                //System.out.print(" " + i + " " + arr[i]);
            }
        }
    }
}
