import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez la premiere valeur : ");
        int a = clavier.nextInt();

        System.out.print("Entrez la deuxieme valeur : ");
        int b = clavier.nextInt();

        int max = (int) Math.max(a, b);

        System.out.println("Le maximum est : " + max);
    }
}
