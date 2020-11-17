package math.Game;

public class Game {

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Karesz", new Point(8,3));
        Warrior warrior2 = new Warrior("Sanyesz", new Point(6,5));


        for (int round = 1; warrior1.isAlive() && warrior2.isAlive(); round++){
            System.out.println("Round" + round);
            System.out.println(warrior1);
            System.out.println(warrior2);
            if (warrior1.distance(warrior2) > 0){
                warrior1.move(warrior2);
                warrior2.move(warrior1);

            }else
                warrior1.attack(warrior2);
            if (warrior2.isAlive()){
                warrior2.attack(warrior1);
            }
        }
        System.out.println("Winner" + (warrior1.isAlive() ? warrior1 : warrior2));
    }

}
