package meetingrooms;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Officenew {



    private static List <MeetingRoomnew> meetingRooms = new ArrayList<>();

    public static void printNames() {
        for (MeetingRoomnew meetingRoomnew : meetingRooms) {
            System.out.println(meetingRoomnew.getName());
        }
    }
    public static void printNamesReverse() {
        for (int i = meetingRooms.size()-1;i>=0;i--){
            System.out.println(meetingRooms.get(i));

        }


    }


    public static void printMeetingRoomsConstains() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mit a tárgyaló nevében:");
        String contains = sc.nextLine();
        for (int i= 0; i <meetingRooms.size();i++){


           System.out.println();
        }
    }
    public void addMeetingRoomnew(MeetingRoomnew meetingRoomnew) {
        meetingRooms.add(meetingRoomnew);
    }
    public static List<MeetingRoomnew> getMeetingRooms() {
        return meetingRooms;
    }

    public static void setMeetingRooms(List<MeetingRoomnew> meetingRooms) {
        Officenew.meetingRooms = meetingRooms;
    }

    public static void printMeetingRoomswithName() {
    }

    public static void printAreas(int area) {

        }


    public static void printEventNames() {
    }

    public static void printAreas() {
    }

    public static void printAreasLargerThan(int area) {
        for (MeetingRoomnew meetingRoomnew : meetingRooms){
            if (meetingRoomnew.getArea()> area){
                System.out.println(meetingRoomnew.getName());
            }
    }




    }
}


