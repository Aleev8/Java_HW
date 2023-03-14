package sem2;

// Напишите метод, который принимает на вход строку (String) и определяет является
// ли строка палиндромом (возвращает boolean значение). Без встр. функций


public class task3 {

    public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }
        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args)
    {
        String str = "yessey";

        if (isPalindrome(str)) {
            System.out.println("Yes, Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

}