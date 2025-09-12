
public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    String calc(String input) {
        int a = number();
        int b = number();
        char operator;
        int result = calculated(a, b, operator);
        System.out.println();
        a = scanner.nextInt();
        operator = scanner.next().charAt(0);
        b = scanner.nextInt();
        System.out.println(a, operator, b);

        public static int number () {
            System.out.println();
            int number;
            if (scanner.nextInt()) {
                number > 10;
            } else {
                System.out.println(throws Exception);
                scanner.next();
            }
            return number;
        }
    }

    public static int calculated(int a, int b, char operator) {
        int result;
        switch (operator) {
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
                result = a / b;
                break;
            default:
                System.out.println("throws Exception");
                result = calculated(a, b, operator());
                return result;
        }


    }


}