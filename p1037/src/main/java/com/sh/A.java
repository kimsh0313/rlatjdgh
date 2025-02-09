package com.sh;
import java.util.Arrays;
import java.util.Scanner;
public class A  {
    public static void main(String[] args) {
        //참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
        //참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
//참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
//참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
//참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
//참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
//참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.참조입니다.
        //Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.

        //Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.

        //Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.

        //Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.Ex1037 참조입니다.


        Scanner sc = new Scanner(System.in);

        // 정수 N의 진짜 약수의 개수 입력 받기
        int divisorCount = sc.nextInt();

        // 정수 N의 진짜 약수를 저장할 배열 생성
        int[] divisors = new int[divisorCount];

        // 진짜 약수 입력 받기
        for (int i = 0; i < divisorCount; i++) {
            divisors[i] = sc.nextInt();
        }

        // 배열 정렬
        Arrays.sort(divisors);

        // 정수 N 계산 (가장 작은 진짜 약수 * 가장 큰 진짜 약수)
        int result = divisors[0] * divisors[divisorCount - 1];

        // 결과 출력
        System.out.println(result);
    }
}