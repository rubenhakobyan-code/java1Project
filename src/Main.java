public class Main {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(a);
        System.out.println(b);

        short c = 1000;
        short d = 2000;
        System.out.println(c);
        System.out.println(d);

        int e = 50000;
        int f = 100000;
        System.out.println(e);
        System.out.println(f);

        long g = 123456789L;
        long h = 987654321L;
        System.out.println(g);
        System.out.println(h);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        byte binByte = 0b00001010;
        int binInt = 0b101010;
        System.out.println(binByte);
        System.out.println(binInt);

        float j = 5.75f;
        float k = 10.25f;
        System.out.println(j);
        System.out.println(k);

        double l = 19.99;
        double m = 45.123456;
        System.out.println(l);
        System.out.println(m);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        float f1 = 12.345f;
        double d1 = 34.567839023;
        System.out.println(f1);
        System.out.println(d1);

        char n = 'A';
        char o = 'Z';
        System.out.println(n);
        System.out.println(o);

        char s = 77;
        char w = 109;
        System.out.println(s);
        System.out.println(w);

        char kChar1 = 'K';
        char kChar2 = 75;
        char kChar3 = '\u004B';
        System.out.println(kChar1);
        System.out.println(kChar2);
        System.out.println(kChar3);

        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);

        int aa = 7;
        long bb = aa;
        System.out.println(bb);

        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myDouble);
    }
}