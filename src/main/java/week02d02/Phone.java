package week02d02;


import java.util.Scanner;

public class Phone {
    public String type;
    public int mem;

    public Phone (String type, int mem){
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Kérem a telefon típusát: ");
       String typeA = scanner.nextLine();
        System.out.println("Kérem a telefon memódia méretét:");
int memA = scanner.nextInt();
scanner.nextLine();

Phone telefonA = new Phone (typeA,memA);

        System.out.println("Típus megadása: ");
        typeA = scanner.nextLine();
        System.out.println("Mem megadása: ");
            memA = scanner.nextInt();
    Phone telefonB = new Phone(typeA,memA);

        System.out.println(telefonA.getType() + " " + telefonA.getMem());
        System.out.println(telefonB.getType() + " " + telefonB.getMem());

    }

} // 6 percet adtatok rá, eddig jutottam
