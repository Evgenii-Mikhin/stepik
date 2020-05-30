import java.util.Scanner;

//Реализуйте метод, проверяющий, является ли заданная строка палиндромом
public class Task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        boolean result = isPalindrome(str);
        System.out.println(result);
    }
        private static boolean isPalindrome(String string) {
            String clean = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int length = clean.length();
            int forward = 0;
            int backward = length - 1;
            while (backward > forward) {
                char forwardChar = clean.charAt(forward++);
                char backwardChar = clean.charAt(backward--);
                if (forwardChar != backwardChar)
                    return false;
            }
            return true;
        }



}
