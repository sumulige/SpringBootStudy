package com.example.springbootstudy.arithmetic;

import java.util.Scanner;

public class RoundNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正浮点数：");
        double input = scanner.nextDouble();

        // 四舍五入
        long rounded = Math.round(input);

        System.out.println("近似整数值为: " + rounded);

    }

}
