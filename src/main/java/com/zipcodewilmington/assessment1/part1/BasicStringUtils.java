package com.zipcodewilmington.assessment1.part1;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String result = "";
        char firstLetter;

        firstLetter = str.charAt(0);
        char cap = Character.toUpperCase(firstLetter);

        result = result + cap;

        for (int i = 1; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = "";
        char[] reverse = str.toCharArray();
        for(int index = str.length()-1; index >= 0; index--){
            result += reverse[index];
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverseString = "";
        String reverseCamel = "";

        char[] reverse = str.toCharArray();

        for(int index = str.length()-1; index >= 0; index--){
            reverseString += reverse[index];
        }
        char first = reverseString.charAt(0);
        char toUppercase = Character.toUpperCase(first);

        reverseCamel = reverseCamel + toUppercase;
        for (int i = 1; i<reverseString.length();i++){
            reverseCamel += reverseString.charAt(i);
        }

        return reverseCamel;
    }





    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = "";
       char[] mod = str.toCharArray();
       for( int index = 1; index < str.length() - 1;index++){
           result += mod[index];

       }
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))== true ){
                result += Character.toLowerCase(str.charAt(i));
            } else
                result += Character.toUpperCase(str.charAt(i));
        }
        return result;
    }
}
