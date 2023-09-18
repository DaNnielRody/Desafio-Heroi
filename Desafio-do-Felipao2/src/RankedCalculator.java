import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RankedCalculator {

    public int winResult(int wins, int defeats){
        return wins - defeats;
    }

    public String rankPosition(int position){
        if(position >= 11 && position <= 20){
            return "Ferro";
        } else if (position >= 21 && position <= 50) {
            return "Bronze";
        } else if (position >= 51 && position <= 80) {
            return "Ouro";
        }else if (position >= 81 && position <= 90) {
            return "Diamante";
        }else if (position >= 91 && position <= 100) {
            return "Ouro";
        }else if (position >= 101) {
            return "Imortal";
        }else{
            return "Unranked";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, herói. Digite quantas vitórias você tem: ");
        int myHeroWins = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Olá, herói. Digite quantas derrotas você tem: ");
        int myHeroDefeats = scanner.nextInt();
        scanner.nextLine();

        RankedCalculator myHeroRank = new RankedCalculator();

        int resultRank = myHeroRank.winResult(myHeroWins, myHeroDefeats);
        String resultPosition = myHeroRank.rankPosition(resultRank);

        System.out.printf("O Heróis tem um saldo de %d está no nível de %s%n", resultRank, resultPosition);
    }
}