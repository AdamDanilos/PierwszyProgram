package instrukcjaWarunkowa;

public class SwichIW {
    public static void main(String[] args) {

        int zmienna = 4;

        switch (zmienna) {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Brak danych");
        }
    }
}
