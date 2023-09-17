import java.util.Scanner;

/*
# 1️⃣ Desafio Classificador de nível de Herói

**O Que deve ser utilizado**

- Variáveis
- Operadores
- Laços de repetição
- Estruturas de decisões

## Objetivo

Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

Se XP for menor do que 1.000 = Ferro
Se XP for entre 1.001 e 2.000 = Bronze
Se XP for entre 2.001 e 5.000 = Prata
Se XP for entre 6.001 e 7.000 = Ouro
Se XP for entre 7.001 e 8.000 = Platina
Se XP for entre 8.001 e 9.000 = Ascendente
Se XP for entre 9.001 e 10.000= Imortal
Se XP for maior ou igual a 10.001 = Radiante

## Saída

Ao final deve se exibir uma mensagem:
"O Herói de nome **{nome}** está no nível de **{nivel}**"


 */

public class DesafioDoHeroi {
    private static final int MIN_LEVEL = 1000;
    public String heroRanking(int xp){
        String ranking;

        switch (xp){
            case 1000 -> ranking = "Ferro";
            case 1001, 2000 -> ranking = "Bronze";
            case 2001, 6000 -> ranking = "Prata";
            case 6001, 7000 -> ranking = "Ouro";
            case 7001, 8000 -> ranking = "Platina";
            case 8001, 9000 -> ranking = "Ascendente";
            case 9001, 10000 -> ranking = "Imortal";
            default -> {
                if(xp >= 10001){
                    ranking = "Radiante";
                }else{
                    ranking = "Valor fora da tabulação, pegue mais xp para entrar em algum rank.";
                }
            }
        }
        return ranking;
    }

    public int levelingUp(int currentXP){
        int remainingAmount = MIN_LEVEL - currentXP;

        if(currentXP < MIN_LEVEL){
            for(int i = 1; i <= remainingAmount; i++){
                System.out.println("Pegando XP: " + i);
                currentXP++;
            }
        }
        return currentXP;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui o nome do seu herói: ");
        String nameHero = scanner.nextLine();

        System.out.println("Digte aqui a quantidade de XP do seu herói: ");
        int xpHero = scanner.nextInt();

        DesafioDoHeroi myHero = new DesafioDoHeroi();
        int myHeroLevel = myHero.levelingUp(xpHero);
        String myRanking = myHero.heroRanking(myHeroLevel);

        System.out.printf("O Herói do nome %s está no nível %s com %d pontos!", nameHero,myRanking, myHeroLevel);
    }
}