class Lingkaran {

    double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getKeliling() {
        return 2 * 3.14 * jari2;
    }

    public double getLuas() {
        return 3.14 * jari2 * jari2;
    }

    public String toString() {
        return "lingkaran ini memiliki:" + "jari-jari " + jari2 + " keliling " + this.getKeliling() + " luas "
                + this.getLuas();
    }

    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(4);
        System.out.println(L1);
    }
}
