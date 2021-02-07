package week05d04;

public class Product {

    private long price;
    private Currency currency;

    public Product(long price, Currency currency) {
        this.price = price;
        this.currency = currency;

    }


    public double converPrice (Currency currency){
        checkCurrency(currency);
        if (this.currency.equals("HUF") && currency.equals("USD")){
            return price / 300;
    }
    if (this.currency.equals("USD") && currency.equals("HUF")) {
        return price * 300;
    }
    return price;

}
 private void checkCurrency(Currency currency){
     boolean valid = "HUF".equals(currency)||"USD".equals(currency);
     if(valid)
         throw new IllegalArgumentException(String.format("Currency (%s) can only be HUF or USD",currency));

 }

}
