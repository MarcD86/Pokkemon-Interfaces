import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "elecEllentric";
    List<String> attacks = Arrays.asList ("thunderpunch", "electroball", "thunder", "volttackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "fire" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunderPunch " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunderPunch " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp()  );
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunderPunch " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunderPunch " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void electroBall(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "fire" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with electroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + damage);
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with electroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + damage);
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with electroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + damage);
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with electroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void thunder(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "fire" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunder " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunder " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunder " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with thunder " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void voltTackle(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "fire" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with voltTackle " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with voltTackle " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with voltTackle " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with voltTackle " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };


}