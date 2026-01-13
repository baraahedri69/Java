public class Ex2 {
    public static void main(String[] args) {

        // ===== Question 1 =====
        int x = 5;  
        int y = 3;
        int z;
        z = x++ + y;

        // ===== Question 2 =====
        int compteur = 12;
        if (compteur > 10)
            System.out.println("compteur est plus grand que 10");

        // ===== Question 3 =====
        int total = 20;
        total -= --x;

        // ===== Question 4 =====
        int q = 17;
        int diviseur = 5;
        q = q % diviseur;
        q %= diviseur;

        // ===== Questions 5 à 9 : application demandée =====
        int somme = 0;
        x = 1;

        while (x < 11) {
            somme += x;
            x++;
        }

        System.out.println("la somme vaut : " + somme);
    }
}
