package finalmodifier;

public class CylinderCalculator {


    public double calculateVolume (double r, double h){
        return r*r*h*CircleCalculator.PI;
    }
    public double calculateSurfaceArea (double r, double h){
        return (2*CircleCalculator.PI*r*r) + (h+CircleCalculator.PI*r*2);

    }
}
