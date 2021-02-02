package meetingrooms;

import java.util.Scanner;

public class Controllernew {

    private static Officenew officenew;

    public static void printMenu(){
        System.out.println("Ez a menü, kérem válasszon az alábbi tevékenységek közül:");
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgylók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
        System.out.println("Kérem adja meg, melyik parancsot kívánja futtatni:");
    }



    public static void main(String[] args) {
        Controllernew controller = new Controllernew();
        Controllernew.readOffice();
        Controllernew.printMenu();
        Controllernew.runMenu();
            }


            public static void readOffice(){
        officenew = new Officenew();
        Scanner sc = new Scanner(System.in);
                System.out.println("Hány tárgyalót kíván rögzíteni?");
                int numberofMeetingRooms = sc.nextInt();
                sc.nextLine();
                for (int i = 0;i<numberofMeetingRooms;i++){
                    int k = i+1;
                    System.out.println("Kérem a(z) " + k +". tárgyaló nevét:");
                    String name = sc.nextLine();

                    System.out.println("Kérem a tárgyaló hosszát:");
                    int length = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kérem a tárgyaló szélességét:");
                    int width = sc.nextInt();
                    sc.nextLine();
                    MeetingRoomnew meetingRoomnew = new MeetingRoomnew(name, length, width);
                    officenew.addMeetingRoomnew(meetingRoomnew);
                }

            }
    private static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        if (menu==1){
           Officenew.printNames();
    }
        if (menu==2){
            Officenew.printNamesReverse();

    }
        if (menu==3){
            Officenew.printEventNames();
        };

        if (menu==4){
            Officenew.printAreas();

        }
        if (menu==5){
            Officenew.printMeetingRoomswithName();
        }
        if (menu==6){
            Officenew.printMeetingRoomsConstains();
        }
        if (menu==7){

            System.out.println("kérek egy méretet");
        int area = scanner.nextInt();
        scanner.nextLine();
        Officenew.printAreasLargerThan(area);
        }
    }
}

