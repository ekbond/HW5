public class CountArrow {
    
    // Поля

    // Конструктор
    // public CountArrow() {} - Конструтор будет указан не явно

    // Свойства
    // Не требует явного указания свойств, т.к. данные не меняются и расскладка одинакова для каждого объекта

    // Методы
    // Метод для подсчёта стрелок в строке
    public int countArrows(String sequence) {
        int count = 0;
        int n = sequence.length();
        
        // Проходим по строке, проверяя возможные стрелки
        for (int i = 0; i <= n - 5; i++) {

            String substring = sequence.substring(i, i + 5);
            
            if (substring.equals(">>-->") || substring.equals("<--<<")) {
                count++;
            }
        }
        return count;
    }
}
