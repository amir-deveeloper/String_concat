package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 17;
        while (n != 1){

            if (n % 2 == 0){

                n = n / 2;

            }
            else{

                n = 3*n + 1;

            }

        }




        //System.out.println(sequentialSearch(new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37}, 15));
    }








/*
    public static int sequentialSearch(int[] arr, int x) {
        boolean l = false;
        int n = 0;

        while (l == false) {

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == x) {
                    l = true;
                    n = 1;

                    return i;
                }

            }

            if (n == 0){

                return -1;

            }


        }

            return -1;



    }

 */


















    /*
    public static int binarySearch(int [] arr, int x){

        int l = 0;
        int r = arr.length - 1;
        while (l <= r){

            int m = l + (r - l)/2;
            if (arr[m] == x){

                return m;
            }
            if (x > arr[m]){

                l = m+1;

            }else{
                r = m -1;
            }

        }

        return -1;
    }

     */





}
