import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstString;
        final int NUM = 7;
        String word = " Колобок";
        firstString = NUM + word;
        System.out.println(firstString);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Здравствуйте, " + name);
        in.close();
    }
}