import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        System.out.println("Случайное число: "+number);
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }
        System.out.println("Сумма чётных: " + evenSum);
        System.out.println("Сумма нечётных: " + oddSum);
        }
    }
