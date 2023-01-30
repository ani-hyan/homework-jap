package homework_1;

public class PrimitiveTypes {
    public static void main(String[] args){
        //Group Integer
        byte a = 23;
        byte b = -36;
        System.out.println("a = " + a + ", b = " + b);

        short c = 3415;
        short d = 7890;
        System.out.println("c = " + c + ", d = " + d);

        int e = -414;
        int f = 0;
        System.out.println("e = " + e + ", f = " + f);

        long g = 36;
        long h = -234567897;
        System.out.println("g = " + g + ", h = " + h);

        System.out.println("Byte min = " + Byte.MIN_VALUE);
        System.out.println("Byte max = " + Byte.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE);
        System.out.println("Short max = " + Short.MAX_VALUE);
        System.out.println("Integer min = " + Integer.MIN_VALUE);
        System.out.println("Integer max = " + Integer.MAX_VALUE);
        System.out.println("Long min = " + Long.MIN_VALUE);
        System.out.println("Long max = " + Long.MAX_VALUE);

        //Group Floating point number
        float j = 134.2353f;
        float k = -8765432.1f;
        System.out.println("j = " + j + ", k = " + k);

        double l = 2.4d;
        double m = 4.56d;
        System.out.println("l = " + l + ", m = " + m);

        System.out.println("Float min = " + Float.MIN_VALUE);
        System.out.println("Float max = " + Float.MAX_VALUE);
        System.out.println("Double min = " + Double.MIN_VALUE);
        System.out.println("Long max = " + Double.MAX_VALUE);

        float f1 = 12.345f;
        float f2 = 3456.091f;

        double d1 = 34.567839023d;
        double d2 = 12.345d;
        double d3 = 8923.1234857d;
        double d4 = 3456.091d;

        //Group Characters
        char n = 'n';
        char o = '-';
        System.out.println("n = " + n + ", o = " + o);

        System.out.println('M');
        System.out.println('m');

        char t = 9;

        //Group Boolean
        boolean p = false;
        boolean q = true;
        System.out.println("p = " + p + ", q = " + q);

        //13. error ցույց կտա քանի որ տիպերի անհամաձայնություն կա

        //Java Type Casting
        int aa = 7;
        long bb = aa;
        System.out.println("aa = " + aa + ", bb = " + bb);

        int myInt = 7;
        double myDouble = myInt;
        System.out.println("myInt = " + myInt + ", myDouble = " + myDouble);

        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println("dd = " + dd + ", ii = " + dd);

        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println("ff = " + ff + ", gg = " + gg);

        /*
        18.
        long max = 312345678;
        double d = 1000.00;
        char i =’i’; char j=’j’; String ij = "" + i + j;
        int a = 8;
        long h = 8;
        int n, m = 11; n = m;
        */

    }

}
