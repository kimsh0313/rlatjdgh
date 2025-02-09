package com.sh;
import java.util.Scanner;
public class Ex4344reference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt(); // test 횟수 입력

        for(int i=0;i<testCase;i++) {
            int n = sc.nextInt(); // 학생 수
            int[] arr = new int[n]; // 한 테스트 안에 학생 수 만큼에 성적 배열
            int sum=0; // 성적 누적 합

            // 성적 입력
            for(int j=0;j<n;j++) {
                int val=sc.nextInt(); // 성적 입력
                arr[j]=val;
                sum += val; // 점수 누적 합
            }

            double mean = sum/n; //평균
            double count=0;

            // 평균보다 높은 성적을 가진 학생 수 체크
            for(int j=0; j<n; j++) {
                if(arr[j]>mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
출처: https://kang-james.tistory.com/entry/백준-4344번-Java-평균은-넘겠지 [내 꿈을 JAVA:티스토리]