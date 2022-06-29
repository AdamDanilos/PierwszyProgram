package Zadanie2;

public class TablicaObliczenia {
    private int [] tablica;

    public TablicaObliczenia(int [] podajtablice){
        tablica = podajtablice;
    }

    public int suma() {
        int suma = 0;
        for(int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return suma;

    }
    public int srednia() {
        return suma() / tablica.length;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            min = tablica[i];
        }
        return min;
    }
    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

}
