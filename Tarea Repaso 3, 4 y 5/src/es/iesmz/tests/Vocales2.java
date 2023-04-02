package es.iesmz.tests;

import java.util.ArrayList;

public class Vocales2 {
    public static String sinvocales(String cadena) {
        String noVocales = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.toLowerCase(cadena.charAt(i)) != 'a' && Character.toLowerCase(cadena.charAt(i)) != 'e' && Character.toLowerCase(cadena.charAt(i)) != 'i'
                    && Character.toLowerCase(cadena.charAt(i)) != 'o' && Character.toLowerCase(cadena.charAt(i)) != 'u') {
                noVocales += cadena.charAt(i);
            }
        }
        return noVocales;
    }
}
