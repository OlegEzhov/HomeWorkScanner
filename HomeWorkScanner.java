import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Тестировал со значением 123.

        System.out.print("Введите число: ");
        int q = sc.nextInt();
        System.out.println("Делление: " + (q / 2));
        System.out.println("Процент деления: "+ (q % 2));

        System.out.print("Введите число: ");
        int w = sc.nextInt();
        System.out.println("Делление: " + (w / 2));
        System.out.println("Процент деления: "+ (w % 2));

        System.out.print("Введите число: ");
        int e = sc.nextInt();
        System.out.println("Делление: " + (e / 2));
        System.out.println("Процент деления: "+ (e % 2));

        System.out.print("Введите число: ");
        int r = sc.nextInt();
        System.out.println("Делление: " + (r / 2));
        System.out.println("Процент деления: "+ (r % 2));

        System.out.print("Введите число: ");
        int t = sc.nextInt();
        System.out.println("Делление: " + (t / 2));
        System.out.println("Процент деления: "+ (t % 2));

        System.out.print("Введите число: ");
        int y = sc.nextInt();
        System.out.println("Делление: " + (y / 2));
        System.out.println("Процент деления: "+ (y % 2));

        System.out.print("Введите число: ");
        int u = sc.nextInt();
        System.out.println("Делление: " + (u / 2));
        System.out.println("Процент деления: "+ (u % 2));

        // результат: 1111011

        sc.close();
    }
}
