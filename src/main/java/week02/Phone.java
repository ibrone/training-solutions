package week02;


import java.util.Scanner;

public class Phone {
    public String type;
    public int mem;

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
       String type = scanner.nextLine();
        System.out.println("Kérem a telefon memódia méretét:");
int mem = scanner.nextInt();
        System.out.println(type);
        System.out.println(mem);
            }

} // 6 percet adtatok rá, eddig jutottam
