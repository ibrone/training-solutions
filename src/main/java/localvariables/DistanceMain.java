package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(300.12,false);
        System.out.println(distance.getKm() + " " + distance.isExact());

        int a =(int) distance.getKm();



        System.out.println(a);
    }

    }

