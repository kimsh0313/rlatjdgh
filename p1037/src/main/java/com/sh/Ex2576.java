package com.sh;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex2576 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int sum = 0;
//        int min =100;
//
//        for (int i =0; i<7;i++){
//            int num = Integer.parseInt(br.readLine());
//            if (num%2 == 1){
//                sum += num;
//                min = Math.min(min, num);
//            }
//        }
//        if (sum==0){
//            System.out.println(-1);
//        }else {
//            System.out.println(sum);
//            System.out.println(min);
//        }
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nums = sc.nextInt();

    int min =100;
    int sum = 0;

    if (nums%2==1){
        for (int i =0; i<7;i++){
            sum += nums;
        }

    }
    min = Math.min(min, nums);
    System.out.println(sum);
    System.out.println(min);
}
}

