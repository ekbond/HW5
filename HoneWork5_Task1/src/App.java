import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Информация о букве будет вводится с клавиатуры
        Scanner scanner = new Scanner(System.in);    
        
        System.out.print("Введите букву: ");
        char in_сhar = scanner.next().charAt(0);
        
        // Вызываем конструтор из класса StringKeyBoard
        StringKeyBoard keyboard = new StringKeyBoard();

        char prev_char = keyboard.getLeftChar(in_сhar);

        System.out.println("Слева от " + in_сhar + " стоит буква " + prev_char);

    }
}
