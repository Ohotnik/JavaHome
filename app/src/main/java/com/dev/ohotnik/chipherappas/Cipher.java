package com.dev.ohotnik.chipherappas;

import java.util.HashMap;

public class Cipher {

    public String Encrypt(String text)
    {
        HashMap<Character, Character> cipherAlphabet = GetAlphabet();

        String encr = "";
        for (int i = 0; i < text.length(); i++) {
            Character symbol = text.charAt(i);
            symbol = Character.toLowerCase(symbol);

            Character encrChar = cipherAlphabet.get(symbol);

            if (encrChar != null) {
                encr += encrChar;
            }
        }

        return encr;
    }

    public String Decrypt(String text)
    {
        HashMap<Character, Character> cipherAlphabet = GetAlphabet();
        HashMap<Character, Character> decipherAlphabet = GetDecipherAlphabet(cipherAlphabet);


        String decr = "";
        for (int i = 0; i < text.length(); i++) {

            Character symbol = text.charAt(i);
            Character encrChar = decipherAlphabet.get(symbol);

            if (encrChar != null) {
                decr += encrChar;
            }

            // decr += decipherAlphabet.get(text.charAt(i));

        }

        return decr;
    }

    private static HashMap<Character,Character> GetDecipherAlphabet(HashMap<Character,Character> cipherAlphabet) {
        HashMap<Character, Character> alphabetDecryption = new HashMap<>();

        for (Character i : cipherAlphabet.keySet()) {
            Character key = cipherAlphabet.get(i);
            if (!alphabetDecryption.containsKey(key)) {
                alphabetDecryption.put(key, i);
            } else
            {
                return null;
            }
        }
        return alphabetDecryption;
    }

    private static HashMap<Character, Character> GetAlphabet()
    {
        HashMap<Character, Character> alphabetEncryption = new HashMap<>();
        alphabetEncryption.put(' ', ' ');
        alphabetEncryption.put('а', '\u0168');
        alphabetEncryption.put('б', '\u2D40');
        alphabetEncryption.put('в', '\u03F4');
        alphabetEncryption.put('г', '\u13C3');
        alphabetEncryption.put('ґ', 'Z');
        alphabetEncryption.put('д', 'D');
        alphabetEncryption.put('е', 'E');
        alphabetEncryption.put('є', 'Э');
        alphabetEncryption.put('ж', '\u2230');
        alphabetEncryption.put('з', '\u0C8A');
        alphabetEncryption.put('и', '\u2A5B');
        alphabetEncryption.put('і', '\u0C79');
        alphabetEncryption.put('ї', ':');
        alphabetEncryption.put('й', '~');
        alphabetEncryption.put('к', '\u049E');
        alphabetEncryption.put('л', '\u0169');
        alphabetEncryption.put('м', '\u1A13');
        alphabetEncryption.put('н', '\u1E22');
        alphabetEncryption.put('о', 'О');
        alphabetEncryption.put('п', '\u25E4');
        alphabetEncryption.put('р', '\u1583');
        alphabetEncryption.put('с', 'C');
        alphabetEncryption.put('т', '\u2CD6');
        alphabetEncryption.put('у', 'U');
        alphabetEncryption.put('ф', '\u2C17');
        alphabetEncryption.put('х', '\u254B');
        alphabetEncryption.put('ц', 'Ц');
        alphabetEncryption.put('ч', 'u');
        alphabetEncryption.put('ш', '\u1783');
        alphabetEncryption.put('щ', '\u1784');
        alphabetEncryption.put('ь', '\u24D1');
        alphabetEncryption.put('ю', 'Ю');
        alphabetEncryption.put('я', 'я');

        return alphabetEncryption;
    }
}
