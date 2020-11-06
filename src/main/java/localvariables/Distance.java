package localvariables;

public class Distance {
    private   double Km;
    private boolean exact;

    public Distance (double Km, boolean exact){
    this.Km = Km;
    this.exact = exact;}

    public double getKm() {
        return Km;
    }

    public boolean isExact() {
        return exact;


    }
}
