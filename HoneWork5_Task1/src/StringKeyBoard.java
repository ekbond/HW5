public class StringKeyBoard {

    // Поле
    private static final String keyboard = "qwertyuiopasdfghjklzxcvbnm"; // Обозначение константы, эта переменная будет конечна без несения изменения

    // Конструтор 
    // Конструтор будет указан Джавой по умолчанию, т.к. он пустой - все вводные данные указаны как константа и нет изменяемого состояния
    // public StringKeyBoard() {} - Конструтор будет указан не явно

    // Свойства
    // Не требует явного указания свойств, т.к. данные не меняются и расскладка одинакова для каждого объекта

    // Методы
    // Метод для получения предыдущей буквы при указании буквы с клавиатуры
    public char getLeftChar(char currentChar) {
        int index_char = keyboard.indexOf(currentChar);
    
        if (index_char == -1) {
            throw new IllegalArgumentException("Неверный символ: " + currentChar);
        }

        int previous_char  = (index_char - 1 + keyboard.length()) % keyboard.length();  // Формула для вычисления предыдщуего индекса в строке
        return keyboard.charAt(previous_char);  // Метод строки String, который возвращает символ строки по индексу
    }

    @Override
    public String toString() {
        return "Раскладка " + keyboard;
    }

}
