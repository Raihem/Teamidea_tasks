
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число, для вычесления количества нулей от факториала этого числа, либо 'exit' для выхода");

        while (true) {

            Scanner scanner = new Scanner(System.in);

            String arg = scanner.nextLine();
            if(arg.equals("exit")){
                System.out.println("Вычисления остановлены...");
                scanner.close();
                break;}
            else {

                int n = 0;
                try {

                    n = Integer.parseInt(arg.trim());

                } catch (NumberFormatException nfe) {
                    System.out.println((char) 27 + "[31mНекорректный ввод!" + (char)27 + "[0m");
                    System.out.println(nfe.getMessage() + " Введите число без пробелов и прочих символов");
                }

                int N = n;
                int res = 0;

                while (n > 0) {
                    n /= 5;
                    res += n;
                }

                System.out.println("Число N = " + N + "\n" + "Количество нулей на конце числа, являющегося результатом вычисления факториала N! = " + res + "\n");

                }
        }
    }
}
