public class Main {

    public static String calculate(String expression) {
        // Проверяем корректность входных данных
        if (expression == null || expression.isEmpty())
            return "Ошибка: пустое выражение";


        // Разбиваем выражение на части
        String[] parts = expression.split("\\s+");

        if (parts.length != 3) {
            return "Ошибка: неверный формат выражения";
        }

        String num1Str = parts[0];
        String operator = parts[1];
        String num2Str = parts[2];

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Проверяем диапазон чисел
        if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10) {
            return "Ошибка: числа должны быть от 0 до 10";
        }

        // Выполняем операцию
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    return "Ошибка: деление на ноль";
                }
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("строка не является математической операцией");

        }
        return "Ошибка: неизвестный оператор";
    }
}








