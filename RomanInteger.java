import java.util.Scanner;

class RomanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman value");
        String roman = sc.nextLine().toUpperCase();
        int result = Roman_Integer(roman);
        System.out.println("Integer value is: " + result);
    }

    public static int Roman_Integer(String s) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int result = 0;
        int i = 0;
        for (int j = 0; j < symbols.length; j++) {
            while (s.startsWith(symbols[j])) {
                result = result + values[j];
                s = s.substring(symbols[j].length());
            }
        }
        return result;
    }
}
