package p1;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        System.out.println("Введите массив: " );
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        for( int num : arr) {
            total = total+num;
        }
        System.out.println("Сумма элементов массива: " + total );
        }
    }

