public class ContohIfBersarang {
    public static void main(String[] args) {
        int belanja = 90000;
        int diskon = 0;
        if (belanja > 100000) {
            diskon = belanja / 10;
        } else if (belanja > 75000) {
            diskon = belanja * 8 / 100;
        } else if (belanja > 50000) {
            diskon = belanja * 5 / 100;
        } else if (belanja > 25000) {
            diskon = belanja * 3 / 100;
        } else {
            diskon = 0;
        }

        System.out.println("diskon = " + diskon);
    }
}