package finalmodifier;


import static finalmodifier.CircleCalculator.PI;
public class PiMain {

    public static void main(String[] args) {
        System.out.println(PI);

CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.calculateArea(10));
        System.out.println(circleCalculator.calculatePerimeter(10));

        CylinderCalculator cylindercalculator = new CylinderCalculator();

        System.out.println(cylindercalculator.calculateSurfaceArea(10,10));
        System.out.println(cylindercalculator.calculateVolume(10,10));
    }

}
