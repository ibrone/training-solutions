package finalmodifier;

public class Gentleman {

    public static final String Message_Prefix ="Hello";
    public String sayHello (String name){
        return Message_Prefix +name;
    }

    public static void main(String[] args) {
        System.out.println(new Gentleman().sayHello(" Joe"));
    }

}


