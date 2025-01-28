package stringsQuestions;

public class VowelConsonantCounter {
	
    public static void main(String[] args) {
    	
        String str = "Hello World!";
        int vowels = 0, consonants = 0;

        for (char c : str.toLowerCase().toCharArray()) {
        	
            if (Character.isLetter(c)) {
            	
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
