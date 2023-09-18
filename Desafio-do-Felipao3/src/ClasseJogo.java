import java.util.Scanner;

public class ClasseJogo {

    private final String name;
    private int age;
    private final String type;
    public ClasseJogo(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String attackHero(String heroi) {
        return switch (heroi.toLowerCase()) {
            case "mago" -> "magia";
            case "guerreiro" -> "espada";
            case "monge" -> "artes marciais";
            case "ninja" -> "shuriken";
            default -> "Crie seu personagem";
        };
    }

    public void attack(String attackHero){
        System.out.printf("O %s atacou usando %s%n", this.type, attackHero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nameHero = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int ageHero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a sua class: ");
        String heroClass = scanner.nextLine();

        ClasseJogo myHero = new ClasseJogo(nameHero, ageHero, heroClass);

        String myClass = myHero.attackHero(heroClass);

        myHero.attack(myClass);
    }
}