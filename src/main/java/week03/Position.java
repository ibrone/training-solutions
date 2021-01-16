package week03;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;


    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> emberek  = new ArrayList<>();
        emberek.add(new Position("főnök",300000));
        emberek.add(new Position("művezető", 200000));
emberek.add(new Position("szakmunkás", 21000));


for (Position item : emberek){
    if (item.getBonus()>150000)
        System.out.println(item.getName() + " : "+item.getBonus());
}




    }

}
