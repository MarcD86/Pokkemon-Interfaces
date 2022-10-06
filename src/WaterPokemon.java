import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with surf " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with surf " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with surf " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with surf " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void hydroPump(Pokemon name, Pokemon enemy) {
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroPump " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroPump " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroPump " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroPump " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void hydroCanon(Pokemon name, Pokemon enemy) {
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroCanon " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroCanon " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroCanon " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with hydroCanon " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    void rainDance(Pokemon name, Pokemon enemy) {
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with rainDance " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with rainDance " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "grass" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with rainDance " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with rainDance " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };


}