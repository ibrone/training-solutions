package attributes.person;

public class PersonMain {



    public static void main(String[] args) {
        Address address = new Address("Magyarország","Érd","Jenő 1", "2030");


        System.out.println(address.addresstoString());
    }

}
