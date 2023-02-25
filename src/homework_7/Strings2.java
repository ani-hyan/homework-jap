package homework_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//ppx -> palindrome todo

public class Strings2 {
    public static void main(String[] args) {
        Strings2 obj = new Strings2();

//        //1.
//        System.out.println(obj.ozChar("ozymandias"));
//
//        //2.
//        System.out.println(obj.numberOfXX("xxaxdxx"));
//
//        //3.
//        System.out.println(obj.isPalindrome("abcba"));
//
//        //4.
//        String[] a = obj.listOfStrings("a23", "adwad", "ddwew", "232", "ada");
//        for (String s: a)
//            System.out.print(s + ", ");
//        System.out.println();
//
//        //5.
//        System.out.println(obj.evenOdd(new int[]{12,21,1,2,3}));
//
//        //6.
//        System.out.println(obj.deCoding("cza", 5));
//
//        //8.
//        System.out.println(obj.commonSubsequence("abdcommondecommona","ascommoncommon"));
//
//        //9.
//        System.out.println(obj.numberOfCommonCharacters("abcqewrq","dgaudgaiabc"));
//
//        //10.
//       System.out.println(obj.reverseCharInParentheses("foo(bar(baz)blim)"));

       //additional
        System.out.println(obj.canFormPalindrome("aabbc"));

    }

    /**
     * 1. Given a string, return a string made of the first 2 chars
     * "ozymandias" -> "oz"
     */
    String ozChar(String str) {
        if (str.charAt(0) == 'o')
            if (str.charAt(1) == 'z')
                return "oz";
            else
                return "o";
        else if (str.charAt(1) == 'z')
            return "z";
        else
            return "";
    }

    /**
     * 2. Counts the number of "xx"; overlapping is allowed
     * @param str
     * @return
     */
    int numberOfXX(String str){
        int n = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                n++;
            }
        }
        return n;
    }

    /**
     * 3. Detects if a word is palindrome
     * @param str
     * @return true if the given string is palindrome
     */
    boolean isPalindrome(String str){
        if(str.length() <= 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        return false;
    }

    /**
     * 4. returns a list of all strings that start
     * with the letter 'a' (lower case) and have exactly 3 letters
     * @param arr
     * @return
     */
    String[] listOfStrings(String... arr){
        List<String> s = new ArrayList<>();
        for(String string: arr){
            if(string.charAt(0) == 'a' && string.length() == 3){
                s.add(string);
            }
        }

        String[] str = new String[s.size()];
        str = s.toArray(str);
        return str;
    }

    /**
     * 5. returns a comma-separated string based on a given list of integers
     * (3,44) -> '"o3,e44"
     * @param arr
     * @return
     */
    String evenOdd(int[] arr){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                str.append("e").append(arr[i]);
            else{
                str.append("o").append(arr[i]);
            }
            str.append(", ");
        }
        return str.deleteCharAt(str.length()-2).toString();
    }

    /**
     * 6.	Шифр Цезаря
     */
    String deCoding(String text, int number){
        text = text.toLowerCase(Locale.ROOT);
        String newText = "";
        char flag = text.charAt(0);
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) >= 97 && text.charAt(i) <= 122-number){
                flag = (char)(text.charAt(i)+number);
            }
            if(text.charAt(i) > 122 - number && text.charAt(i) <= 122){
                flag = (char)(text.charAt(i) + number - 27);
            }
            newText += flag;
        }
        return newText;
    }

    /**
     * 8. finds the longest common sub-sequence
     * @param s1
     * @param s2
     * @return
     */
    String commonSubsequence(String s1, String s2){
        int maxCount = 0;
        int finalStart = 0;
        if(s1.length() < s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        for(int i = 0; i < s1.length(); i++){
            int start = i;
            int currCount = 0;
            for(int j = 0; j < s2.length(); j++){
                if (s1.charAt(i) == s2.charAt(j)){
                    currCount = 1;
                    while(j < s2.length() && s1.charAt(i) == s2.charAt(j)){
                        i++;
                        j++;
                        currCount++;
                    }
                }
            }
            if(maxCount < currCount && finalStart < start){
                maxCount = currCount;
                finalStart = start;
            }
        }
        return s1.substring(finalStart, finalStart + maxCount-1);
    }

    /**
     * 9. Find the number of common characters between two strings
     */
    int numberOfCommonCharacters(String s1, String s2){
        int counter = 0;

        List<Character> list = new ArrayList<>();
        for (char aChar : s1.toCharArray()) {
            list.add(aChar);
        }

        for (char c : s2.toCharArray()) {
            if (list.contains(c)) {
                list.remove(Character.valueOf(c));
                counter++;
            }
        }
        return counter;
    }


    /**
     * 10. Reverses characters in (possibly nested) parentheses in the input string
     */
    String reverseCharInParentheses(String str){
        StringBuilder stringB = new StringBuilder(str);
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                arr.add(i);
            }
        }
        Integer[] intArray = new Integer[arr.size()];
        intArray = arr.toArray(intArray);
        for(int i = intArray.length - 1; i >= 0; i--){
            int j = intArray[i];
            int k = stringB.indexOf(")");
            StringBuilder temp = new StringBuilder(stringB.substring(j+1, stringB.indexOf(")")));
            stringB.replace(j+1, k, temp.reverse().toString());
            stringB.deleteCharAt(k);
            stringB.deleteCharAt(j);
        }
        return stringB.toString();
    }

    /**
     * Check if characters of a given string can be rearranged to form a palindrome
     */

    boolean canFormPalindrome(String str){
        List<Character> list = new ArrayList<>();

        for(int i = 0; i<str.length(); i++){
            if(list.contains((Character)str.charAt(i)))
                list.remove((Character)str.charAt(i));
            else
                list.add(str.charAt(i));
        }

        if(str.length() %2 == 0 && list.isEmpty())
            return true;
        else if(str.length() % 2 == 1 && list.size() == 1)
            return true;
        else
            return false;
    }

}
