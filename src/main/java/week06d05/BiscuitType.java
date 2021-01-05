package week06d05;

public enum BiscuitType {
    OREO(30),PILOTA(40),HIT(34);
private final int gramAmount;

BiscuitType (int gramAmount){
    this.gramAmount = gramAmount;
}
public int getGramAmount(){
    return gramAmount;
}
}

