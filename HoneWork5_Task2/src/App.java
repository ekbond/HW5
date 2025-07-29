import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с символами: ");
        String sequence = scanner.nextLine();
        
        // Проверка условия: Строка может содержать до 106 символов
        if (sequence.length() > 106) {
            System.out.println("Ошибка: строка превышает 106 символов");
        } else {
            // Вызываем конструтор из класса
            CountArrow arrowCounter = new CountArrow();

            // Вызываем метод, который вернет количество строк из класса
            int result = arrowCounter.countArrows(sequence);
            
            // Вывести значение в консоли 
            System.out.println("Количество стрел (>>--> или <--<<) в строке: " + result);
        
        }
        
    }
}