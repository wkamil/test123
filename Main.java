public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Osoba osoba = new Osoba();
        osoba.ustawWiek(15);
        int ileLatMaOsoba = osoba.zwrocWiek();
        System.out.println(ileLatMaOsoba);
    }
}
