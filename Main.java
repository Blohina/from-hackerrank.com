package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        sc.nextLine();
        for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
        }
        sc.close();
        int countNegative = 0;
        int dim = 1;
        while (dim <=length) {
            int index = 0;
            while (index <= length - dim) {
                int sum = 0;
                for (int j = index; j < dim + index; j++) {
                    sum += arr[j];
                }
                if (sum < 0) {
                    countNegative++;
                }
                index++;
            }
            dim++;
        }
        System.out.println(countNegative);

    }


}
