import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes da seguinte maneira:");
        System.out.println("(nome-gênenero,)");

        String nomesString = s.nextLine();

        System.out.println("### Nomes em String ###");
        System.out.println(nomesString);

        String[] nomesArray = nomesString.split(",");
        System.out.println("### Nomes em Array ###");
        for (int i = 0; i < nomesArray.length; i++) {
            System.out.println(nomesArray[i]);
        }

        List<String> homens = new LinkedList<String>();
        List<String> mulheres = new LinkedList<String>();

        for (int i = 0; i < nomesArray.length; i++) {
            if (nomesArray[i].contains("-m")) {
                homens.add(nomesArray[i]);
            } else if (nomesArray[i].contains("-f")) {
                mulheres.add(nomesArray[i]);
            } else {
                continue;
            }
        }

        System.out.println("### Homens: ###");
        System.out.println(homens);
        System.out.println("");

        System.out.println("### Mulheres: ###");
        System.out.println(mulheres);
        System.out.println("");
    }
}
