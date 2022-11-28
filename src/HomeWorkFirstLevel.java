import java.util.Scanner;

public class HomeWorkFirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число не меньше двух");
        int number = scanner.nextInt();
        for (int j = 2; j <= number; j++) {
            if (number % j == 0) {
                System.out.println("Наибольший делитель без остатка равен " + number / j);
                break;
            }
        }

    }
}
