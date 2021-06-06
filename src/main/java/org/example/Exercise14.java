/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 14 - Tax calculator

package org.example;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        //Read in input from user
        Scanner getNum = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double subtotal = getNum.nextDouble();

        Scanner getState = new Scanner(System.in);
        System.out.print("What is the state? ");
        String state = getState.nextLine();

        //initialize tax
        double tax_cost = 0.0;

        //If statement for checking the state tax
        if(state.equals("WI")) {

            //calculate tax cost
            tax_cost = subtotal * 0.055;

            //printout if true
            System.out.println(String.format("The subtotal is $%.02f.", subtotal));
            System.out.println(String.format("The tax is $%.02f.", tax_cost));
        }
        double final_total = tax_cost +subtotal;
        System.out.println(String.format("The total is $%.02f.", final_total));
    }

    }

