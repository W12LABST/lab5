package Test1;

import static org.junit.jupiter.api.Assertions.*; //asercje
import org.junit.jupiter.api.Test; // pakiet do pisania testów

public class Testy {
    Funkcje f2 = new Funkcje();
    //@Test - adnotacja oznaczająca rozpoczęcie się kodu testu
    //Wszystkie z testów zaprojektowane są tak aby dały wynik "passed"
    //Aby było inaczej należałoby zmienić wartośc oczekiwaną na błędną
    //assert equals przyjmuje funkcjię z podanymi w niej argumentami oraz wartość oczekiwaną
    //testy funkcji sprawdzania temperatur
    @Test
    void testTempObieMniejszeOdSto() {
        assertEquals(true, f2.sprawdzanieTemp(46,78));
    }

    @Test
    void testTempDrugaMniejszaOdSto() {
        assertEquals(true, f2.sprawdzanieTemp(120,78));
    }

    @Test
    void testTempPierwszaMniejszaOdSto() {
        assertEquals(true, f2.sprawdzanieTemp(46,123));
    }

    @Test
    void testTempObieWiekszeOdSto() {
        assertEquals(false, f2.sprawdzanieTemp(156,178));
    }

    //testy funkcji wyszukiwania sekwencji w tablicy
    @Test
    void testSekwencjiWystepujacej() {
        int tab[] = {1, 2, 2, 3, 4, 3, 1, 1, 2, 3};
        assertEquals(true, f2.sprawdzenieSekwencji(tab));
    }

    @Test
    void testSekwencjiNiewystepujacej() {
        int tab[] = {1, 2, 2, 3, 4, 3, 1, 2, 2, 3};
        assertEquals(false, f2.sprawdzenieSekwencji(tab));
    }

    @Test
    void testSekwencjiNaPustejTablicy() {
        int tab[] = {};
        assertEquals(false, f2.sprawdzenieSekwencji(tab));
    }

    //testy funkcji zwracającej połowę stringa
    @Test
    void testpolowyStringaParzystego() {
        assertEquals("qwe", f2.polowaStringa("qwerty"));
    }

    @Test
    void testPolowyStringaNieparzystego() {
        assertEquals("q", f2.polowaStringa("qwe"));
    }

    @Test
    void testPolowyStringaPustego() {
        assertEquals("", f2.polowaStringa(""));
    }

    //testy funkcji odwracającej tablicę
    @Test
    void testOdwrotnosc1() {
        int a[] = {1, 2, 3};
        int b[] = {3, 2, 1};
        assertArrayEquals(b, f2.odwrotnaTablica(a));
    }

    @Test
    void testOdwrotnosc2() {
        int a[] = {};
        assertArrayEquals(a, f2.odwrotnaTablica(a));
    }

}
