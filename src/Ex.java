import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex {
    static int[][] game = new int[6][6];

    public static void main(String[] args) {
//        game[3][3] = 6;
//
//        Object[] obj = game;
//
//        obj[3] = "X";
//        System.out.println(game[3][3]);
//
//        String a = "wertyui";
//        StringBuilder b2 = new StringBuilder("sdfgh");
//        StringBuilder b = b2;

        String str = "WERT";
        // str =str.toLowerCase();
        //System.out.println(low);
        System.out.println(str.toLowerCase());
        System.out.println(str);

        //

    }

    public static void third(int[] a, int[] b, int[] c){
        int i =0;
        int j = b.length -1;
        int k = 0;
        while(i < a.length && j >=0) {
            if (b[j] < a[i]) {
                c[k] = b[j];
                j--;
            } else {
                c[k] = a[i];
                i++;
            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            k++;
            i++;

        }
        while (j >= 0) {
            c[k] = b[j];
            k++;
            j--;
        }
    }

    public static void first(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("the largest: " + max);
        System.out.println("the smallest: " + min);
    }

    public static void second(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("input numbers");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("sum: " + sum);
    }


}
