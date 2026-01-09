class Complexe {
    private double reel;
    private double imaginaire;

    Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    String info() {
        return reel + " + i" + imaginaire;
    }

    Complexe produit(Complexe z) {
        double r = this.reel * z.reel - this.imaginaire * z.imaginaire;
        double i = this.reel * z.imaginaire + this.imaginaire * z.reel;
        return new Complexe(r, i);
    }

    static Complexe produit(Complexe z1, Complexe z2) {
        double r = z1.reel * z2.reel - z1.imaginaire * z2.imaginaire;
        double i = z1.reel * z2.imaginaire + z1.imaginaire * z2.reel;
        return new Complexe(r, i);
    }
}
