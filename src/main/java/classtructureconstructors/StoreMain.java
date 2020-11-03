package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store almaStore = new Store("alma");
        almaStore.store(10);
        System.out.println(almaStore.getProduct() + ": " + almaStore.getStock());

        Store korteStore = new Store("korte");
        korteStore.store(20);
        System.out.println(korteStore.getProduct() + ": " + korteStore.getStock());

      almaStore.dispatch(500);
        korteStore.dispatch(23);
        almaStore.store(440);
        korteStore.store(22);

        System.out.println(almaStore.getProduct() + ": " + almaStore.getStock());
        System.out.println(korteStore.getProduct() + ": " + korteStore.getStock());
    }
}