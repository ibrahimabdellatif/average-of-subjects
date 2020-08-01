package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("this program account the average for degree of subjects");
        System.out.println("please enter number of subjects");
        Scanner input = new Scanner(System.in);
        int numOfSubject = input.nextInt();
        double sum = 0;
        double [] average = new double[numOfSubject];
        for (int i=0 ; i<average.length;i++){
            System.out.println("Enter Degree Of Subject " + (i + 1));
            average[i] = input.nextDouble();
            sum +=average[i] ;
        }
        System.out.println("the average of degrees is " + sum / average.length);
    }
}

