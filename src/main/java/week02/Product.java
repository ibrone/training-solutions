package week02;

public class Product {
    
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean aretheyEquals (Product p){
return name.equals(p.name);
    }
    public static void main(String[] args) {
        Product product1 = new Product("proba","CV01" );
        Product product2 = new Product("valami", "CV02");
        Product product3 = new Product("proba", "CV01");

        System.out.println(product1.aretheyEquals(product2));
        System.out.println(product1.aretheyEquals(product3));
        System.out.println(product2.aretheyEquals(product3));
    }
}
