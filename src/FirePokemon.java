import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire";

    List<String> attacks = Arrays.asList ("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    public List<String> getAttacks(){
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with fireLash " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with fireLash " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with fireLash " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                exponential = 0;
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with fireLash " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void flameThrower(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with flameThrower " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with flameThrower " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with flameThrower " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with flameThrower " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void pyroBall(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with pyroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with pyroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with pyroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with pyroBall " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void inferno(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with inferno " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with inferno " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with inferno " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with inferno " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };



}
