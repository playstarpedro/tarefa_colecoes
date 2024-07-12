import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Parte1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separados por , :");
        String nomesString = s.nextLine();

        System.out.println("### Nomes em String ###");
        System.out.println(nomesString);
        System.out.println("");

        String[] nomesArray = nomesString.split(",");

        System.out.println("### Nomes em Array ###");
        for (int i = 0; i < nomesArray.length; i++) {
            System.out.println(nomesArray[i]);
        }
        System.out.println("");

        List<String> nomesEmOrdemAlfabetica = new LinkedList<String>();
        for (int i = 0; i < nomesArray.length; i++) {
            nomesEmOrdemAlfabetica.add(nomesArray[i]);
        }
        Collections.sort(nomesEmOrdemAlfabetica);
        System.out.println("### Nomes em Ordem Alfabética(LinkedList) ###");
        System.out.println(nomesEmOrdemAlfabetica);

    }
}
