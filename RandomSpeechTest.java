package Randomizer;

import java.util.Scanner;

public class RandomSpeechTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ile razy chcesz bełkotać? ");
        int iloscPowtorzen = sc.nextInt();

        String[] przemowaZdania = new String[iloscPowtorzen];
        StringBuilder prezentacja = new StringBuilder();

        for (int i = 0; i <= przemowaZdania.length - 1; i++) {
            RandomSpeech przemowa = new RandomSpeech();
            String przemowa1 = przemowa.wypowiedz;

            przemowaZdania[i] = przemowa1;

            prezentacja.append(przemowaZdania[i]);


        }
        System.out.println(prezentacja.toString());


    }
}
