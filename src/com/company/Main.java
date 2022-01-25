package com.company;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr0[]=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0; i < 10; i++) {
            System.out.println("Enter your number");
            int k= Integer.parseInt(in.nextLine());
            arr0[i]= k;
        }
        int arrA0[] = new int [10];
        arrA0 = printReverse(arr0);
        System.out.println("Your array in reverse is: "+ Arrays.toString(arrA0));
        int answer;
        answer = getLargest(arr0);
        System.out.println("Largest number in the array is: "+ answer);
        arrA0= computeTwice(arr0);
        System.out.println("The array with each digit doubles is: "+ Arrays.toString(arrA0));

    }
    public static int[] printReverse(int[] arr0){
        int[] arr1 = new int [10];
        //as the first array goes ++ the second array must go -- and assign the values to each other
        int count = arr0.length-1;
        for(int i = 0; i<= arr0.length-1; i++){
            arr1[count]=arr0[i];
            count--;
        }
        return arr1;
    }
    public static int getLargest(int[] arr0){
        int k = arr0[0];
        for(int i =1;i<arr0.length-1;i++){
            if(arr0[i]>k){
                k=arr0[i];
            }
        }
        return k;
    }
    public static int[] computeTwice(int arr0[]){
        for(int i = 0; i<= arr0.length-1; i++){
            arr0[i] = arr0[i]*2;
        }
        return arr0;
    }
}
