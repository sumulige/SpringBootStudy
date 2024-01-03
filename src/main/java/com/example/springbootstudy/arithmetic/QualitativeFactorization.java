package com.example.springbootstudy.arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QualitativeFactorization {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        StringBuilder stringBuilder = new StringBuilder();

        while ((input = bufferedReader.readLine()) != null) {
            int parseInt = Integer.parseInt(input);
            for (int i = 2; i < Math.sqrt(parseInt); i++) {
                if (parseInt % i == 0) {
                    stringBuilder.append(i).append(" ");
                    parseInt /= i;
                    i--;
                }
            }
            stringBuilder.append(parseInt).append(" ");
            System.out.println(stringBuilder.toString());
        }

    }
}
