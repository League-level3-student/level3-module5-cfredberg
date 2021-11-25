package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
        // 1. If there are no removes left
           if (removesLeft == 0) {
            // 2. Return the string
        	   return str;
           }
        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then return trimString() 
           else {
        	   String str1 = str;
        	   str = "";
        	   for (int i = 0; i < str1.length()-1; i++) {
        		   str = str + str1.charAt(i);
        	   }
        	   
        	   removesLeft--;
        	   return trimString(str, removesLeft);
           }
    }
}
