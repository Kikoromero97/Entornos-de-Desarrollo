package es.iesmz.tests;

import java.util.ArrayList;

public class Vocales2 {
    public static String sinvocales(String cadena) {
        StringBuilder noVocales = new StringBuilder();
        ArrayList<Character> letras = new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != 'a' || cadena.charAt(i) != 'e' || cadena.charAt(i) != 'i'
                    || cadena.charAt(i) != 'o' || cadena.charAt(i) != 'u') {
                letras.add(cadena.charAt(i));
            }
        }
        for (int i = 0; i < letras.size(); i++) {
            noVocales.append(letras.get(i));
        }
        return noVocales.toString();
    }
}
