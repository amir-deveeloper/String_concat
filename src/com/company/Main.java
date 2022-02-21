package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 23};

        for (int i = 0; i < arr.length; i++){

            if (i == 0){

                System.out.print(arr[i] + " is first, ");
            }

            else if (i == arr.length-1){

                System.out.println(arr[i] + " is last");

            }

            else{

                System.out.print(arr[i] + " is after " + arr[i-1] + " and below " + arr[i+1] +", ");

            }

        }




        }








    }





