package Test1;
//logika poprzednio napisanych programów została przeniesiona do osobnej klasy w postaci funkcji
public class Funkcje {
    public boolean sprawdzanieTemp(float t1, float t2){
        if ((t1 < 100) || (t2 < 100)) {
            return true;
        } else
            return false;
    }

    public boolean sprawdzenieSekwencji(int[] tab){
        for(int i = 1; i<tab.length; i++) {
            if((tab[i-1] == 1) && (tab[1] == 2) && (tab[i+1] == 3)) {
                return true;
            }
        }
        return false;
    }

    public String polowaStringa(String s){
        return s.substring(0, s.length()/2);
    }

    public int[] odwrotnaTablica(int[] tablicaPierwotna){
        int tablicaOdwrocona[] = new int[tablicaPierwotna.length];
        int i = 0;
        for(int j = tablicaPierwotna.length - 1; j>=0; --j){
            tablicaOdwrocona[i++] = tablicaPierwotna[j];
        }
        return tablicaOdwrocona;
    }

}
