package ZadanieZmienneOperatory;

public class ZadanieZmienneOperatory1 {
    public static void main(String[] args) {

       //zadanie numer 1
        int wiek = 31;
        double wzrost = 1.87;
        double waga = 119;

        System.out.println("Wiek " + wiek + " lat " + " Wzrost " + wzrost + " metra " + " Waga " + waga + " kg");

        //zadanie numer 2

        double bmi;

        bmi = waga / Math.pow(wzrost,2);
        System.out.println("BMI: " + bmi);

        //zadanie numer 3

        int bmi2 = (int) bmi;
        System.out.println(bmi2);

        // zadanie numer 4

        int a = 12;
        int b = 2;
        int c = 3;
        int d = 11;

        int e = a/b;
        System.out.println(e);
        int f = a/c;
        System.out.println(f);
        int g = a/d;
        System.out.println(g);

        double e2 = a%b;
        double f2 = a%c;
        double g2 = a%d;
        System.out.println(e2 + " " + f2 + " " + g2);





    }
}
