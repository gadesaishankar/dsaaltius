import java.util.*;
public class solution {

    public static boolean isPalindrome(String s) {

        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;

        int right = s1.length() - 1;

        while (left < right) {

            if (s1.charAt(left) != s1.charAt(right)) {

                return false;

            }

            left++;

            right--;

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(isPalindrome(input));

        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); 

        System.out.println(isPalindrome("race a car")); 

        System.out.println(isPalindrome(" "));

} }