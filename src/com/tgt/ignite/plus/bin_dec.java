package com.tgt.ignite.plus;

import java.util.Scanner;

public class bin_dec {
    public static void main(String[] args){
        int n,dec=0,p=0,temp1;
        Scanner read= new Scanner(System.in);
        System.out.println("enter a binary num");
        n=read.nextInt();

        while(n>0){
            temp1=n%10;
            dec+=temp1*Math.pow(2,p);
            p++;
            n=n/10;
        }
        System.out.println("decimal equivalent is" +dec);
    }
}
