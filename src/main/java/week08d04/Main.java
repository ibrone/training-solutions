package week08d04;

public class Main {

    public static void main(String[] args) {
        Trainer goodmoodTrainer = new Trainer(new GoodMood());
        Trainer badmoodTrainer = new Trainer(new BadMood());
        System.out.println(goodmoodTrainer.giveMark());
        System.out.println(badmoodTrainer.giveMark());
    }
}
