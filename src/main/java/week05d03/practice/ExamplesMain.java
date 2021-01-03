package week05d03.practice;

public class ExamplesMain {


    public static void main(String[] args) {
Engine engine = new Engine(2.2, "V8");
Car car = new Car(engine,"Toyota","red",3 );

        System.out.printf(car.getEngine().getType());
    }
}
