package com.sh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2789 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        int n = words.length();
        String nwords = "CAMBRIDGE";
        for (int i =0; i <n; i++){

            if (words.equals(nwords))
                System.out.println(words.charAt(i));
        }
    }
}
