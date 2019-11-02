package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size = input.nextInt();
            if(size>10){
                System.out.println("Size should not exceed 20");
            }

        }
        while(size>20);
        array = new int[size];
        int i =0;
        while(i<array.length){
            System.out.println("enter element "+(i+1) + " :");
            int number = input.nextInt();
            array[i] = number;
            i++;
        }
        System.out.println("Property list:");
        for(int j = 0 ; j <array.length ; j++){
            System.out.printf(array[j] + "\t");

        }
        int temp;
        for(int h = 0 ; h< array.length/2 ; h ++){
            temp = array[h];
            array[h] = array[array.length - 1 - h];
            array[array.length -1-h] = temp;
        }
        System.out.println("\nReverse list :");
        for (int k = 0 ; k < array.length ; k++){
            System.out.print(array[k] + "\t");
        }
    }
}
