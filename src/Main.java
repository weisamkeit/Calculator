import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа: ");
        Scanner number = new Scanner(System.in);
        double num = number.nextDouble();
        double tho = number.nextDouble();

        System.out.println("выбери операцию \n / * - + ");
        Scanner doitman = new Scanner(System.in);
        char op = doitman.next().charAt(0);
        double result;

        switch (op){

            case '/':
                result = num / tho;
                System.out.println(result);
                break;

            case '*':
                result = num * tho;
                System.out.println(result);
                break;

            case '-':
                result = num - tho;
                System.out.println(result);
                break;

            case '+':
                result = num + tho;
                System.out.println(result);
                break;
        }
    }
}