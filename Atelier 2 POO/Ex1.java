/*
Correction – Exercice 1 : Observation

Programme analysé : Boucles.java
Objectif : déterminer l’affichage du programme et expliquer le comportement des boucles
*/

public class Ex1 {
    public static void main(String[] args) {

        // ======= 1ère partie =======
        int a = 0;

        // La boucle do...while s’exécute AU MOINS UNE FOIS
        // Condition : a < 5
        do {
            System.out.println("java");
            a++;
        } while (a < 5);

        // Après la boucle :
        // "java" est affiché 5 fois
        // a vaut 5
        System.out.println("valeur de a en sortie de boucle = " + a);

        System.out.println();


        // ======= 2ème partie =======
        int b = 0;

        // La condition est a < -1
        // a vaut 5, donc la condition est FAUSSE
        // MAIS do...while s’exécute une fois quand même
        do {
            System.out.println("java");
            b++;
        } while (a < -1);

        // Après la boucle :
        // "java" est affiché 1 seule fois
        // b vaut 1
        System.out.println("valeur de b en sortie de boucle = " + b);

        System.out.println();


        // ======= 3ème partie =======
        int c = 0;

        // La condition c < 0 est FAUSSE dès le début
        // La boucle while ne s’exécute PAS
        while (c < 0) {
            System.out.println("java");
            c++;
        }

        // Après la boucle :
        // "java" n’est jamais affiché
        // c reste égal à 0
        System.out.println("valeur de c en sortie de boucle = " + c);
    }
}
