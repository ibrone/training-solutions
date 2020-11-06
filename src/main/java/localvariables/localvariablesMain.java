package localvariables;

public class localvariablesMain {
    public static void main(String[] args) {
    boolean b = false;
    int a = 2;
    int i = 3, j = 4;
    int k = i;
    String s = "Hello World";
    String t = s;
        {
            int x = 0;
            System.out.println(a);
        }
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        ///System.out.println(x);
    }
}
