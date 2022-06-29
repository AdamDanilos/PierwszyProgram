package Zadanie2;


public class Main1 {
    public static void main(String[] args) {
        int[] tablica = {5, 1, 199, 200, 4, 7};
        TablicaObliczenia tablicaObliczenia = new TablicaObliczenia(tablica);
        System.out.println("Suma: " + tablicaObliczenia.suma());
        System.out.println("Średnia: " + tablicaObliczenia.srednia());
        System.out.println("Max: " + tablicaObliczenia.max());
        System.out.println("Min: " + tablicaObliczenia.min());
    }


}
