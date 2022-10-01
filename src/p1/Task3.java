package p1;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        System.out.println("Введите массив: " );
        int i = 0;
        do {
            arr[i] = scanner.nextInt();
            total = total+arr[i];
            i++;
        }while (i < 10);
        System.out.println("Сумма элементов массива: " + total );
    }
}