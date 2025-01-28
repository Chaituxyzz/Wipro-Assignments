package stringsQuestions;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		
		        String str1 = "Listen";
		        String str2 = "Silent";

		        if (isAnagram(str1, str2)) {
		            System.out.println("The strings are anagrams.");
		        } else {
		            System.out.println("The strings are not anagrams.");
		        }
		    }

		    public static boolean isAnagram(String str1, String str2) {
		        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
		        Arrays.sort(arr1);
		        Arrays.sort(arr2);
		        return Arrays.equals(arr1, arr2);
		    }
		

	}


