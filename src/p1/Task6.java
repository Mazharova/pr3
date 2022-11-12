package p1;

import java.util.Scanner;

public class Task6 {
    public static int factorial(int saint){
        if (saint == 0)
        {
            return 1;
        } else {
            int fact = 1;
            for (int i = 1; i <= saint; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Факториал введенного числа:");
        System.out.println(factorial(a));
    }

}
