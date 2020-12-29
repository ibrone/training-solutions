package methodstructure.pendrives;

public class Pendrive {

    private int capacity;
    private int price;
    private String name;

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public String toString (){
        return "Pendrive tulajdonságai: " + "neve:" + name + "kapacitása: " + capacity + "ára: " + price;
    }
 public void raisePrice (int percent){
        this.price = this.price + (this.price * percent /100);
 }
    public int comparePricePerCapacity(Pendrive other) {
        double ppc = pricePerCapacity();
        double otherPpc = other.pricePerCapacity();
        if (ppc > otherPpc) {
            return 1;
        }
        if (ppc < otherPpc) {
            return -1;
        }
        return  0;
    }

    public boolean cheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    private double pricePerCapacity() {
        return (double)price/capacity;
    }
}