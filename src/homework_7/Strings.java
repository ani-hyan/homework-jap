package homework_7;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Strings obj = new Strings();

        String[] a = {"we ", "are ", "living"};
        String str = "we are living in";

        //1.
        System.out.println("concatenated string: " + obj.concatenation(a));

        //2.
        System.out.println("=======");
        obj.newLine(str);

        //3.
        System.out.println("=======");
        String r = "sample";
        System.out.println("reversed string: " + obj.reverse(r));

        //4.
        System.out.println("=======");
        String line = "We are living in an yellow submarine. We don't  have anything";
        String token = "in";
        System.out.println("count of substring: " + obj.countSubString(line, token));

        //5.
        System.out.println("=======");
        String s = "hello world";
        StringBuilder sb = new StringBuilder("hello world");
        System.out.println("String uppercase: " + obj.toUpperCaseString(s));
        System.out.println("StringBuilder uppercase: " + obj.toUpperCaseStringB(sb));

        //6.
        System.out.println("=======");
        System.out.println(obj.complete());

        //7.
        System.out.println("=======");
        String removed = "We are living in an yellow submarine";
        StringBuilder removedB = new StringBuilder("We are living in an yellow submarine");
        System.out.println("removed \"a\" using String: " + obj.removedA(removed));
        System.out.println("removed \"a\" using StringBuilder: " + obj.removedA(removedB));

        //8.
        System.out.println("=======");
        String replace = "We are living in an yellow submarine.";
        System.out.println(obj.replacedA(replace));

        //9.
        System.out.println("=======");
        String subString = "We are living in yellow submarine";
        System.out.println("the longest subString: " + obj.theLongestSubString1(subString));

        //10.
        System.out.println("=======");
        obj.indexOf("a", subString);

        //11.
        System.out.println("=======");
        obj.printSubLine(subString, 3);
        StringBuilder x = new StringBuilder("We are living in yellow submarine");
        obj.printSubLine(x, 3);

        //12.
        System.out.println("=======");
        System.out.println("Is empty: " + obj.isEmpty(subString));
        System.out.println("Is empty: " + obj.isEmpty(""));

        //13.
        System.out.println("=======");
        String split = "We, are, living, in an, yellow, submarine, We";
        System.out.println("longest: " + obj.theLongestSubString2(split));

    }


    /**
     * 1.կատարում է String concatenation օգտագործելով String
     * @param arr array of strings you want to concatenate
     * @return concatenated string
     */
    String concatenation(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++)
            str += arr[i];
        return str;
    }

    /**
     * 1.կատարում է String concatenation օգտագործելով StringBuilder
     * @param arr array of strings you want to concatenate
     * @return concatenated string
     */
    String concatenationB(String[] arr) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr.length; i++)
            str.append(arr[i]);
        return str.toString();
    }

    /**
     * 2.տպում է ամեն դատարկ  սիվոլից նոր տողում
     * @param str
     */
    void newLine(String str) {
        int i = 0;
        while (str.charAt(i) == ' ')
            i++;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                System.out.print("\n");
                i++;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }


    /**
     * 3. շուռ է տալիս String
     * @param str you want to reverse
     * @return reversed String
     */
    String reverse(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--)
            r += str.charAt(i);
        str = r;
        return str;
    }

    /**
     * 4. ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը
     * @param line
     * @param token
     * @return number of tokens in line
     */
    int countSubString(String line, String token) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            int j = 0;
            int k = i;
            while (j < token.length() && k < line.length() && token.charAt(j) == line.charAt(k)) {
                k++;
                j++;
            }
            if (j == token.length()) {
                count++;
                i = k;
            }
        }
        return count;
    }

    /**
     * 5. տեքստը սարքում է մեծատառերով գրված օգտագործելով String
     * @param str
     * @return uppercase String
     */
    String toUpperCaseString(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
                string += (char) (str.charAt(i) - 32);
            else
                string += str.charAt(i);
        }
        return string;
    }

    /**
     * 5. տեքստը սարքում է մեծատառերով գրված օգտագործելով StringBuilder
     * @param str
     * @return uppercase StringBuilder
     */
    StringBuilder toUpperCaseStringB(StringBuilder str) {
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
               string.append((char)(str.charAt(i) - 32));
            else
                string.append((char)str.charAt(i));
        }
        return string;
    }

    /**
     * 6. տողը լռացնում է պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը
     * @return completed String
     */
    String complete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < 20)
            sb.append('*');
        s = String.valueOf(sb);
        return s;
    }

    /**
     * 7. հեռացնում է բոլոր « a »  սիմվոլները օգտագործելով String
     * @param s
     * @return String with removed "a"
     */
    String removedA(String s) {
        s = s.replaceAll("a", "");
        return s;
    }

    /**
     * 7. հեռացնում է բոլոր « a »  սիմվոլները օգտագործելով StringBuilder
     * @param s
     * @return StringBuilder with removed "a"
     */
    StringBuilder removedA(StringBuilder s) {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                s.deleteCharAt(i);
            }
        }
        return s;
    }

    /**
     * 8. տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * »
     * @param s
     * @return String with replaced "a"
     */
    String replacedA(String s) {
        s = s.replaceAll("a", "*");
        return s;
    }

    /**
     * 9.գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով
     * @param str
     * @return the longest subString
     */
    String theLongestSubString1(String str) {
        String[] array = str.split(" ");
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.length() < array[i].length()) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 10.գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը
     * @param c
     * @param str
     */
    void indexOf(String c, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (c.equals("" + str.charAt(i))) {
                System.out.println("index " + i);
                return;
            }
        }
    }

    /**
     *11. գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը
     * @param line
     * @param n
     */
    void printSubLine(String line, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    /**
     *11. գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը
     * @param line
     * @param n
     */
    void printSubLine(StringBuilder line, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    /**
     * 12.ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ
     * @param s
     * @return whether string is empty/null or not
     */
    boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * 13. տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը
     * @param str
     * @return
     */
    String theLongestSubString2(String str) {
        String[] array = str.split(",");
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.length() < array[i].length()) {
                max = array[i];
            }
        }
        return max;
    }
}
