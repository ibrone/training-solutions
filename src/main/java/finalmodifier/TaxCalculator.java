package finalmodifier;

public class TaxCalculator {

    private static final double tax = 27;

    public double tax (double price){
        return tax * price / 100;

    }

    public double pricewitTax (double price){
        return price * (1+tax/100);
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(100));
        System.out.println(new TaxCalculator().pricewitTax(100));
    }
}
