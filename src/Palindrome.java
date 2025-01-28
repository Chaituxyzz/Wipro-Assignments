package stringsQuestions;

public class Palindrome{
	
    public static void main(String[] args) {
    	
        String str = "madam"; 
        
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
       
             }
    }
    

   public static boolean isPalindrome(String str) {
	   
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
