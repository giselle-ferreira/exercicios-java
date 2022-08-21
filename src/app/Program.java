package app;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int i;
        int I;

        i = 5;
        I = 10;

        final int j = 10;
        int quantityProduct = 50;
        final int NUMBER_ATTEMPTS = 5;   //constant

        // System.out.println(i);
        //System.out.println(I);
        //System.out.println(j);
        //System.out.println(quantityProduct);
        //System.out.println(NUMBER_ATTEMPTS);

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 2000;

        int i2 = 2867;

        long l1 = 100000000000L;

        float f1 = 4.5F;

        double d1 = 85.456;
        double d2 = 234.789D;

        char c1 = 'w';
        // char c2 = 'tw';
        char c3 = '\u0057';

        String st1 = "Giselle";
        String st2 = "Monique";
        String st3 = "kajshjhs haksjlaks lakslaksk shdjsdhsjd";
        String date = "09/12/2000";

        boolean bo1 = true;
        boolean bo3 = false;

        //System.out.println(st1);
        //System.out.println(st2);
        //System.out.println(date);

        //System.out.println("PrePos");
        prePos();
        // System.out.println("Aritmético");
        aritmetico();
        // System.out.println("Atribuição");
        atribuicao();
       // System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {
        int k = 10;

        int i = ++k; // primeiro soma uma unidade, depois atribui
        int j = k--; // o k é atribuído, depois é subtraído
        int x = k;

        // System.out.println("i: " + i);
        //System.out.println("j: " + j);
        //System.out.println("x: " + x);
    }

    private static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        //System.out.println("r1 " + r1);
        //System.out.println("r2 " + r2);
        //System.out.println("r3 " + r3);
        //System.out.println("r4 " + r4);
        //System.out.println("r5 " + r5);

    }

    private static void atribuicao() {
        int i = 1400;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        //System.out.println("d: " + d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        //System.out.println(i);
        //System.out.println(j);
        //System.out.println(d);
        //System.out.println(l);
        //System.out.println(k);

        i = k = j;

        //System.out.println("k: " + k);
        //System.out.println("i: " + i);
    }

    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;
        //System.out.println("operação: " + a);
        //System.out.println("i: " + i ); // só após o final da operação, que o i muda para 11

        int b = k / --i % 3 + 1; // Primeiro muda o valor de i para depois muda-lo 30/ 10 %3 + 1 -> 1
        //System.out.println("operação 2: " + b );
        //System.out.println("i: " + i);

        int c = 2;

        c *= i += 5; // nesse caso, para atribuições compostas, a precedência é da soma
        // System.out.println("operação 3: " + c);

        int x = 3;

        int y = 10 - 5 * 2 + --x; // 10 - 10 + 2
        System.out.println("y: " + y);

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // downcast

        long l1;
        int i1 = 10;
        l1 = i1; // upcast

        int i2;
        long l2 = 100000000000000L;
        i2 = (int) l2; // downcast

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1; // upcast

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // downcast

         // b1 = (byte) d3; // downcast. Maior para o menor


    }
}

