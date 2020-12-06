package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {


        Person person = new Person("Sanyi", 22);
        Person person2 = new Person("Béla", 33);
        Person person3 = person2;

        person3.setName("Józsi");

        System.out.println(person.getName() + " " + person.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());


        int a = 24;
        int b = a;
b++;

        System.out.println(a);
        System.out.println (b);
    }

}
