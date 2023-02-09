public class VowelConsonantsString {

	public static void main(String[] args) {
	     int VowelCount = 0; 
	     int ConsonantsCount = 0;    
   
	        //Declare a string    
	        String someWords = "This is a really simple sentence";    
	            
	        //Converting entire string to lower case to reduce the comparisons    
	        String convertedInLowerCase = someWords.toLowerCase();
	        String convertedInUpperCase = someWords.toUpperCase();
	            
	        for(int i = 0; i < someWords.length(); i++) {    
	            //Checks whether a character is a vowel    
	            if(convertedInLowerCase.charAt(i) == 'a' || convertedInLowerCase.charAt(i) == 'e' || convertedInLowerCase.charAt(i) == 'i' || convertedInLowerCase.charAt(i) == 'o' || convertedInLowerCase.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	            	VowelCount++;    
	            }    
	            //Checks whether a character is a consonant    
	            else if(convertedInLowerCase.charAt(i) >= 'a' && convertedInLowerCase.charAt(i)<='z') {      
	                //Increments the consonant counter    
	            	ConsonantsCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + VowelCount);    
	        System.out.println("Number of consonants: " + ConsonantsCount);    
	}
}
