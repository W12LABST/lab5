package Test1;
//od teraz wszystkie cztery poprzednio napisane programy są połączone w jeden
//z mozliwością wyboru funkcji każdego z nich za pomocą instrukcji switch
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Funkcje f1 = new Funkcje();//obiekt potrzebny do korzystania z wyżej wymienionych funkcji
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz opcje:");
        while(true) {
            cls();//menu
            System.out.println("----------");
            System.out.println("Wybierz numer funkcji:");
            System.out.println("1: Temperatura");
            System.out.println("2: Sekwencja");
            System.out.println("3: Pół stringa");
            System.out.println("4: Odwrotna tablica");
        int wybor = scan.nextInt();
            switch (wybor) {
                case 1://sprawdzanie temperatury
                    System.out.println("UWAGA!!! Separatorem dziesiętnym jest tylko comma");
                    System.out.println("Podaj temperaturę nr 1");
                    float temp1 = scan.nextFloat();
                    System.out.println("Podaj temperaturę nr 2");
                    float temp2 = scan.nextFloat();
                    System.out.println("Zwrócono: " + f1.sprawdzanieTemp(temp1, temp2) + "\nWciśnij enter aby kontynuować.");
                    System.in.read();
                    break;
                case 2://szukanie sekwencji 1, 2, 3 w tablicy
                    int tab[] = {1, 2, 4, 1, 2, 3, 1, 1, 2, 4};
                    System.out.println("\nPrzeszukiwana tablica:");
                    for(int i = 0; i < tab.length; i++) {
                        System.out.print(tab[i] + "\t");
                    }
                    System.out.println("\nWyniki wyszukiwania sekwencji 1, 2, 3: " + f1.sprawdzenieSekwencji(tab) + "\nWciśnij enter aby kontynuować.");
                    System.in.read();
                    break;
                case 3://dzielenie strina na pół
                    String slowo = "aabbvn";
                    System.out.println("Oryginalny string: " + slowo + "\nPołowa stringa: " + f1.polowaStringa(slowo) + "\nWciśnij enter aby kontynuować.");
                    System.in.read();
                    break;
                case 4://odwracanie tablicy
                    int tab1[] = {1, 4, 6, 5, 7, 6, 5};
                    System.out.println("\nOryginalna tablica:");
                    for(int i = 0; i <= 6; i++) {
                        System.out.print(tab1[i] + "\t");
                    }
                    int tablicaOdwrocona[] = f1.odwrotnaTablica(tab1);
                    System.out.println("\nOto tablica odwrócona:");
                    for (int i = 0; i < tab1.length; i++) {
                        System.out.print(tablicaOdwrocona[i] + "\t");
                    }
                    System.out.println("\nWciśnij enter aby kontynuować.");
                    System.in.read();
                    break;
                default://w przypadku wpisanie niepoprawnego znaku
                    System.out.println("Niepoprawny znak.\nWciśnij enter aby kontynuować.");
                    System.in.read();
                    break;
            }
        }
    }
    //Funkcja czyszcząca konsolę:
    private static void cls(){
        for (int i = 0; i < 20; i++) System.out.println(" ");
    }
}