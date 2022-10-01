package p1;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        System.out.println("Введите массив: " );
        int i = 0;
        while (i < 10) {
            arr[i] = scanner.nextInt();
            total = total+arr[i];
            i++;
        }

        System.out.println("Сумма элементов массива: " + total );
    }
}