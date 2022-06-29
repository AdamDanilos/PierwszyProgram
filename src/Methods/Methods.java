package Methods;

public class Methods {
    public static void main(String[] args) {

        // zadanie 1
        String name = "Adam";
        String surname = "Daniłoś";
        String nameAndSurname = "Adam Daniłoś";

        System.out.println(name.length());
        System.out.println(surname.length());
        System.out.println(nameAndSurname.length());

        String name2 = "Alicja";
        String name3 = "Jan";

        Boolean score;

        score = name.equals(name2);
        System.out.println(score);
        score = name.equals(name3);
        System.out.println(score);

        System.out.println(surname.toUpperCase());

        System.out.println(surname.replace('a', 'e'));
        // zadanie 2

        String zdanie = "Potrafię coraz więcej z programowania.";

        System.out.println("Potrafię coraz więcej z programowania.");

        for (int i = zdanie.length() - 1; i >= 0; i--) {
            System.out.println(zdanie.charAt(i));
        }

    }

}
