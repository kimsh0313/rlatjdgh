package com.sh;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex14910 {
    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(String.valueOf(br.readLine().length()));
//
//        for (int i = 0; i<n; i++){
//            int num = br.readLine().charAt(i);
//            int num2 = br.readLine().charAt(i+1);
//            if (num<=num2){
//                System.out.println("good");
//            }else {
//                System.out.println("bad");
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = new String[]{sc.nextLine()};
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(nums[i]);
            int num2 = Integer.parseInt(nums[i+1]);
            if (num <= num2) {
                System.out.println("good");
            } else {
                System.out.println("bad");

            }
        }
    }
}

