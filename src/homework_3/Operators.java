package homework_3;

public class Operators {
    public static void main(String[] args){
        //Arithmetic Operators
        int a = 8;
        int b = 6;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);

        double c = 6.4;
        double d = 0.03;
        System.out.println(c+d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c-d);
        System.out.println(c%d);

        int x = 2*((5+3) * 4 - 8);
        int y = 2*5 + 3*4 - 8;

        //Unary Operators
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int x1 = 3;
        int y1 = ++x1 * 5 / x-- + --x;
        System.out.println("x1 is " + x1);
        System.out.println("y1 is " + y1);

        //Assignment Operator
        int x2 = (int) 1.0;
        System.out.println("x2 = " + x2);
        short y2 = (short) 1921222;
        System.out.println("y2 = " + y2);
        System.out.println(2147483647+1);
        long y3 = (x2 = 3);
        System.out.println("y3 = " + y3);
        boolean b1 = false;
        boolean b2 = (b1 = true);
        System.out.println("b2 = " + b2);

        //Relational Operators
        int aa = 10;
        int bb = 20;
        System.out.println(aa < bb);
        System.out.println(aa <= bb);
        System.out.println(aa >= bb);
        System.out.println(aa > bb);

        //Additional
        float yy = 2.1f;

        byte x4 = 5;
        byte y4 = 10;
        int z = x + y;

        short x5 = 10;
        short y5 = 3;
        int z1 = x5*y5;

        long x6 = 10;
        long y6 = 5;
        y6 = y6*x6;

        int l = 10;
        int k = 5;
        int temp = l;
        l = k;
        k = temp;

        int u1 = 10;
        int k1 = 5;
        //u1 = u1^k1^(k1=u1);
        u1 = u1 - k1;
        k1 = u1 + k1;
        u1 = k1 - u1;

        System.out.println(sum(100));

        //Bitwise & Logical Operators
        int aa1 = 8;
        int bb1 = 3;
        System.out.println(aa1 & bb1);
        System.out.println(aa1 ^ bb1);
        System.out.println(aa1 | bb1);
        System.out.println(~aa1);
        System.out.println(true || (aa1< 4));
        System.out.println((bb1 >= 6) || ++aa1 <= 7);
        System.out.println((aa1<bb1)?aa1:bb1);
        System.out.println(bb1^bb1);

        //Shift Operator
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        int q = 2;
        System.out.println(q << 3);
        System.out.println(q << 4);

    }
    public static int sum(int n){
        return n*(n+1)/2;
    }
}
