package week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    private Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    private Biscuit (BiscuitType type){
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of (BiscuitType type, int gramAmount){
        return new Biscuit(type,gramAmount);
    }
}
