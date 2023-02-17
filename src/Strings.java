import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Strings str = new Strings();
    }

    String concatenation(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++)
            str += arr[i];
        return str;
    }

    String concatenationB(String[] arr) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr.length; i++)
            str.append(arr[i]);
        return str.toString();
    }

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

    String reverse(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--)
            r += str.charAt(i);
        str = r;
        return str;
    }

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

    String complete() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < 20)
            sb.append('*');
        s = String.valueOf(sb);
        return s;
    }

    String removedA(String s) {
        s = s.replaceAll("a", "");
        return s;
    }

    String replacedA(String s) {
        s = s.replaceAll("a", "*");
        return s;
    }

    String theLongestSubString(String str) {
        String[] array = str.split(" ");
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.length() < array[i].length()) {
                max = array[i];
            }
        }
        return max;
    }

    void indexOf(String c, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (c.equals("" + str.charAt(i))) {
                System.out.println("index " + i);
                return;
            }
        }
    }

    void printSubLine(String line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    void printSubLine(StringBuilder line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    String LongestSubString(String str) {
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
