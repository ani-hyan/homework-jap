package homework_6;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int[] a = {3,2,6,9,2,5};
//        print(a);
//
//        short[] b = {2,8,-3,78,231};
//        printReverse(b);
//
//        long[] l = {345678, 32, 3987689, -5, 0};
//        theLargest(l);
//
//        float[] f = {4.f, 422, 54321.87f, -67987};
//        theSmallest(f);
//
//        int[] m = replace(a);
//        for (int i = 0; i < m.length; i++) {
//            System.out.print(m[i] + ", ");
//        }
//        System.out.println();
//
//        int[] arr = sum();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
//        System.out.println();
//        System.out.println(numberOf(a, 2));
//
//        System.out.println("=========");
//        System.out.print("Array: ");
//        print(a);
//        sort(a);
//        System.out.print("Sorted array: ");
//        print(a);
//
//        System.out.println("Odds in the end:");
//        odd(a);
//        print(a);
//
//        System.out.println("Without zero element: ");
//        int[] z = {0,3,10,3,1,0,0,3,0};
//        z = noZero(z);
//        print(z);


        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        upperMatrix(matrix);
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

//        int[][] k = {{1,1,0,0}, {2,-2,1,-1}, {9,7,1,-17}};
//        zeroRow(k);
//
//
//
//        int[] array = {1,1,0,0,1,0};
//        System.out.println(toDecimal(array));

    }

    public static int toDecimal(int[] arr){
        int n = 0;
        int i = 0;
        for (; i<arr.length; i++){
            if(arr[i] == 1){
                int power = 1;
                int j = arr.length-i-1;
                while(j > 0){
                    power *= 2;
                    j--;
                }
                n += power;
            }
        }
        return n;
    }



    //prints the array
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    //տպում է int[] n  array-ի դրական տարրերը

    public static void printPositive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    //տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
    public static void printReverse(short[] arr){
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    //գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը
    public static void theLargest(long[] arr){
        long large = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(large < arr[i])
                large = arr[i];
        }
        System.out.println("the largest number is: " + large);
    }

    //գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը
    public static void theSmallest(float[] arr){
        float small = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(small > arr[i])
                small = arr[i];
        }
        System.out.println("the smallest number is: " + small);
    }

    //int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ
    public static int[] replace(int[] n){
        int[] m = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
        }
        return m;
    }

    //գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ
    public static int[] sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers for array 1: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter numbers for array 2: ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    //հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ

    public static int numberOf(int[] a, int k){
        int n = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == k)
                n++;
        }
        return n;
    }
    //TODO 8

    //անդամները նվազման կարգով
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] > arr[j]) {
                     arr[i] = arr[i]^arr[j]^(arr[j] = arr[i]);
                }
            }
        }
    }

    //վերջում կենտերը
    public static void odd(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i <= j){
            if(arr[i] % 2 != 0){
                arr[j] = arr[j] ^ arr[i] ^ (arr[i] = arr[j]);
                j--;
            }
            i++;
        }
    }
    //TODO change

    //հեռացնել բոլոր զրոները
    public static int[] noZero(int[] a){
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] != 0)
                j++;
        }
        int[] newest = new int[j];
        j=0;
        for (int i = 0; i < a.length; i++){
            if(a[i] != 0) {
                newest[j] = a[i];
                j++;
            }
        }
        return newest;
    }

    //TODO 12
    //արտածել arr 10-ական ներկայացումը

    public static void upperMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[i].length; j++){

                    System.out.println(arr[i][j]);
            }
        }
    }

    public static void transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] ^ arr[j][i] ^ (arr[j][i] = arr[i][j]);
            }

        }
    }

    public static void zeroRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum %2 != 0){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

}

