class Ex5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("La factorielle de " + n + " est " + fact);
    }
}
