class Ex9 {
    public static void main(String[] args) {
        int X = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= X;
        }

        System.out.println(X + " puissance " + n + " = " + result);
    }
}
