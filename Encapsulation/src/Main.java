import data.PlayerEncapsulated;
import data.PlayerNoEncapsulation;

public class Main {
    public static void main(String[] args) {
        PlayerNoEncapsulation playerNoEncapsulation=new PlayerNoEncapsulation();
        playerNoEncapsulation.name="Peter";
        playerNoEncapsulation.health=10;
        playerNoEncapsulation.weapon="sword";
        playerNoEncapsulation.loseHealth(3);
        System.out.println("playerNoEncapsulation's health is now "+playerNoEncapsulation.health);

        PlayerEncapsulated playerEncapsulated = new PlayerEncapsulated("Peter",10,"sword");
        playerEncapsulated.loseHealth(3);
    }
}
