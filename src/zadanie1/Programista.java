package zadanie1;

public class Programista {

    private String imię;
    private String nazwisko;
    private String język;
    private double zarobki;

    public Programista(String pobierzImię, String pobierzNazwisko, String pobierzJęzyk, double pobierzWynagrodzenie ) {
        imię = pobierzImię;
        nazwisko = pobierzNazwisko;
        język = pobierzJęzyk;
        zarobki = pobierzWynagrodzenie;

    }

    public String pobierzImię() {
        return imię;
    }
    public String pobierzNazwisko(String nazwisko) {
        return nazwisko;

    }
    public String pobierzJęzyk(String język) {
        return język;

    }
    public double pobierzWynagrodzenie(double zarobki) {
        return zarobki;

    }
}
