
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

        // Оператор mod обозначается символом % и является оператором деления по модулю.
        // Он возвращает остаток от деления 1-го операнда на 2-й и широко используется в разных языках программирования для решения ряда задач.
    }
}
