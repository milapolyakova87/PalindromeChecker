import java.util.Scanner;

public class PalindromeChecker {

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String input) {
        // Убираем пробелы и приводим строку к нижнему регистру
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Проверяем, является ли строка палиндромом
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false; // Если символы не совпадают, строка не палиндром
            }
            left++;
            right--;
        }

        return true; // Если все символы совпадают, строка палиндром
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем строку у пользователя
        System.out.println("Введи строку для проверки на палиндром:");
        String input = scanner.nextLine();

        // Вызываем метод для проверки палиндрома
        boolean isPalindrome = isPalindrome(input);

        // Выводим результат
        if (isPalindrome) {
            System.out.println("Строка \"" + input + "\" является палиндромом.");
        } else {
            System.out.println("Строка \"" + input + "\" не является палиндромом.");
        }

        scanner.close();
    }
}