package stringtype;


public class StringMain {
    public static void main(String[] args) {

    String prefix = "Hello ";
    String name = "John Doe";
    String message = prefix + name;
    boolean b = message.equals("Hello John Doe");
    boolean c = message.equals("Hello John Doe444");

        message = message + "444";

        System.out.println(message);

        System.out.println(b);
        System.out.println(c);

        String egy = ("");
        String ketto = ("");
        String harom = egy + ketto;
        System.out.println(harom.length());

        String Abcde = "Abcde";
        System.out.println(Abcde.length());
        System.out.println(Abcde.substring(0,1)+"+"+Abcde.substring(2,3));
        System.out.println(Abcde.substring(0,3));
    }
}

