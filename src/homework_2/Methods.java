package homework_2;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Methods m = new Methods();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(m.first(x,z));

        m.second();

        System.out.print("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        m.third(b);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println(m.fourth(c));

        System.out.print("Enter two floats: ");
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println(m.fifth(d,e));

        m.sixth();
    }

    /**
     * @param x
     * @param z
     * @return 0
     */
    int first(int x, int z){
        return 0;
    }

    /**
     * this method does nothing
     */
    void second(){

    }

    /**
     * this method prints "Hello world!"
     * @param b
     */
    void third(boolean b){
        System.out.println("Hello world!");
    }

    /**
     * @param c
     * @return c
     */
    char fourth(char c){
        return c;
    }

    /**
     * @param d
     * @param e
     * @return
     */
    float fifth(float d, float e){
        return e;
    }

    /**
     * recursion
     */
    int i = 0;
    void sixth(){
        while(i < 10){
            i++;
            sixth();
        }
    }
}
