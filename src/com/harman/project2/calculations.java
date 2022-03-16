package com.harman.project2;

import java.util.Scanner;

public class calculations {
        public static void main(String[] args) {
            add addobj=new add();
            multiply multiplyobj=new multiply();
            div8 divobj=new div8();

            Integer x,y,z,addresult,multiplyresult,div8result;
            Scanner input = new Scanner(System.in);
            System.out.println("enter value of x");
            x=input.nextInt();
            System.out.println("enter value of y");
            y=input.nextInt();
            System.out.println("enter value of z");
            z=input.nextInt();
            addresult=addobj.add2numbers(x,y);
            multiplyresult=multiplyobj.multiply2numbers(x,y);
            div8result=divobj.divisible(z);
            System.out.println(addresult);
            System.out.println(multiplyresult);


        }

    }

