
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        char action = getAction(exp);
        String[] data = getData(exp, action);

        // Проверка значений чисел
        for (String datum : data) {
            int number = Integer.parseInt(datum);
            if (number < 1 || number > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
        }

        String result = calculateResult(action, data);
        printInQuotes(result);
    }

    static char getAction(String exp) throws Exception {
        if (exp.contains(" + ")) {
            return '+';
        } else if (exp.contains(" - ")) {
            return '-';
        } else if (exp.contains(" * ")) {
            return '*';
        } else if (exp.contains(" / ")) {
            return '/';
        } else {
            throw new Exception("Некорректный знак действия");
        }
    }

    static String[] getData(String exp, char action) {
        String[] data;
        switch (action) {
            case '+':
                data = exp.split(" \\+ ");
                break;
            case '-':
                data = exp.split(" - ");
                break;
            case '*':
                data = exp.split(" \\* ");
                break;
            case '/':
                data = exp.split(" / ");
                break;
            default:
                data = new String[0];
        }
        return data;
    }

    static String calculateResult(char action, String[] data) throws Exception {
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int result;
        switch (action) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new Exception("Деление на ноль");
                }
                result = a / b;
                break;
            default:
                throw new Exception("Некорректное действие");
        }
        return String.valueOf(result);
    }

    static void printInQuotes(String result) {
        System.out.println("\"" + result + "\"");
    }
}