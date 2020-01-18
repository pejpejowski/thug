package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int plus = 0, wynik = 0;

    static int rzut(int kostki, int ilosckostek) {
        Random ran = new Random();
        int[] kostka = new int[4];
        int[] max = new int[100];
        int x = ilosckostek + plus;



        kostka[0] = 6;
        kostka[1] = 8;
        kostka[2] = 10;
        kostka[3] = 12;


        //losowanie kostkami
        for(int i=0; i <= max.length-1;i++){
            max[i] = ran.nextInt(kostka[kostki])+1;
        }

        for(int i = 0, l = 0; i <= x; i++, l = i - 1){
            if(max[l] == kostka[kostki] && i <= x) {
                wynik = wynik + max[i];
                x++;
                if(i-1 == 0)
                    x--;
            }else if(i <= x - plus){
            wynik = wynik + max[i];
        }else{
                break;
            }

        }


        if(x>ilosckostek+plus)System.out.println("kryt");
    return wynik = wynik + plus;
    }

    static int maxexp(int exp) {
        int[] poziom = new int[10];
        for(int i = 0; i < 10; i++){
            if(i != 0){
            poziom[i] = 100 * (i+1) * 7 + poziom[i-1];
        }else{
                poziom[i] = 100 * (i+1) * 7;
            }
        }

        return poziom[exp-1];
    }

    static int exp(int poziom) {
        Random random = new Random();
        int exp =  random.nextInt(maxexp(poziom)+1);
        return exp;
    }

    static void tworzeniepostaci(int exp) {

    }


        int zycie (int exp) {
        //double podstawa = 13, mnoznik = 3.5, zycie = podstawa + (mnoznik * );
        return 1;
    }

    static void podajliczbe() {
        Scanner scan = new Scanner(System.in);
        int poziom;
        System.out.println("Podaj liczbę od 1 do 10: ");
        do{poziom = scan.nextInt();}
        while(poziom > 11 || poziom < 0);
    }

    public static void main(String[] args) throws Exception {
        String zakoncz;
       // do{
        //    plus = 0; wynik = 0;
          //  rzut(1,2);
            //System.out.println("wynik "+wynik);
            //System.out.println("średnia "+wynik/3);
            //System.out.println("ilość elementów^: "+ wynik/4);
            //System.out.println("Czy chcesz zakończyć? y/n");
            //Scanner scan = new Scanner(System.in);
            //zakoncz = scan.next();
        //}while(!zakoncz.matches("y"));

        Linereader.string("test");
    }
}
