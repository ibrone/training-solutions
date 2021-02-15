package exam03;

public enum CruiseClass {
    LUXURY(3), FIRST(1.8), SECOND(1);

    public static double value;



    CruiseClass (double value){
        this.value = value;
    }
    public static double getValue(){
        return value;
    }


    }