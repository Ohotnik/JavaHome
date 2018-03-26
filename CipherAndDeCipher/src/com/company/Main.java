package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Now enter the number please : ");


        HashMap<Character, String> alphabetEncryption = new HashMap<>();
        alphabetEncryption.put(' ', " ");
        alphabetEncryption.put('а', "\u00a5");
        alphabetEncryption.put('б', "\u2D40");
        alphabetEncryption.put('в', "\u03F4");
        alphabetEncryption.put('г', "\u13C3");
        alphabetEncryption.put('ґ', "Z");
        alphabetEncryption.put('д', "4");
        alphabetEncryption.put('е', "4");
        alphabetEncryption.put('є', "4");
        alphabetEncryption.put('ж', "\u2230");
        alphabetEncryption.put('з', "\u0C8A");
        alphabetEncryption.put('и', "\u2A5B" + "\u0C79");
        alphabetEncryption.put('і', "\u0C79");
        alphabetEncryption.put('ї', "4");
        alphabetEncryption.put('й', "4");
        alphabetEncryption.put('к', "4");
        alphabetEncryption.put('л', "4");
        alphabetEncryption.put('м', "4");
        alphabetEncryption.put('н', "4");
        alphabetEncryption.put('о', "4");
        alphabetEncryption.put('п', "4");
        alphabetEncryption.put('р', "4");
        alphabetEncryption.put('с', "4");
        alphabetEncryption.put('т', "4");
        alphabetEncryption.put('у', "4");
        alphabetEncryption.put('ф', "4");
        alphabetEncryption.put('х', "\u254B");
        alphabetEncryption.put('ц', "4");
        alphabetEncryption.put('ч', "4");
        alphabetEncryption.put('ш', "4");
        alphabetEncryption.put('щ', "4");
        alphabetEncryption.put('ь', "4");
        alphabetEncryption.put('ю', "4");
        alphabetEncryption.put('я', "я");

        String text = in.nextLine();
        String encr = "";
        for (int i = 0; i < text.length(); i++) {
            encr += alphabetEncryption.get(text.charAt(i));
        }

        System.out.print("Encrypted string is : " + encr);
    }
}
