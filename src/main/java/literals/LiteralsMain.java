package literals;

import java.util.Locale;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println("Összefűzés");
        System.out.println(1+""+2);
        System.out.println(Integer.toString(1)+Integer.toString(2));

        System.out.println();

        System.out.println("3/4 osztás");
        double quotient2 = 3/4d;
        System.out.println(quotient2);

        float quotient3 = 3/4f;
        System.out.println(quotient3);

        System.out.println();

        long big = 3_244_444_444l;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word = "title";
        System.out.println(word.toUpperCase(Locale.ROOT));

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));
    }

}
