package com.company;

import java.util.Scanner;

public class Main {

    public static int fun(int n){
        return n+5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fun(a));



    }


}
