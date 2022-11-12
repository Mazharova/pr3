package p1;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void printArray(int[] a, int len)
    {
        for(int i = 0; i < len; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("1 способ: " );
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i=0; i< arr.length; i++){
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("2 способ: " );
        int[] arr1 = new int[5];
        for (int i=0; i< arr1.length;i++){
            arr1[i] = (int) (Math.random() * 101);
            System.out.println(arr1[i]);
        }

        System.out.println("Отсортированные массивы:");
        Arrays.sort(arr);
        Arrays.sort(arr1);

        printArray(arr, 5);
        printArray(arr1, 5);

    }

}
