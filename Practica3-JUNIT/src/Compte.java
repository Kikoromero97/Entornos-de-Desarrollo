import java.math.BigInteger;
import java.util.regex.Pattern;

public class Compte {

    private String numCompte;
    private String nomTitular;
    private String DigitoControl;

    public Compte(String numCompte, String nomTitular) {
        this.numCompte = numCompte;
        this.nomTitular = nomTitular;
    }

    public boolean compruebaIBAN(String anaven) {
        if (anaven.length() != 24) {
            return false;
        }
        int digitoControl = Integer.parseInt(anaven.substring(2, 4));
        String entidad = anaven.substring(4, 8);
        String oficina = anaven.substring(8, 12);
        String dc = anaven.substring(12, 14);
        String cuenta = anaven.substring(14, 24);
        BigInteger numeroSinCC = new BigInteger(entidad + oficina + dc + cuenta + "142800");
        BigInteger modulo = new BigInteger("97");
        BigInteger resto = numeroSinCC.mod(modulo);
        BigInteger digitoControlIBAN = BigInteger.valueOf(98).subtract(resto);
        int result = digitoControlIBAN.intValue();
        if (result == digitoControl) {
            return true;
        } else {
            return false;
        }
    }

    public String generaIBAN(String entitat, String oficina, String dc, String compte) {
        if (entitat.length() != 4 || oficina.length() != 4 || dc.length() != 2 || compte.length() != 10) {
            return null;
        }
        if (!entitat.matches("\\d+") || !oficina.matches("\\d+") || !dc.matches("\\d+") || !compte.matches("\\d+")) {
            return null;
        }
        BigInteger NumeroSinCC = new BigInteger(entitat + oficina + dc + compte + "142800");
        BigInteger Modulo = new BigInteger("97");
        BigInteger Resto = NumeroSinCC.mod(Modulo);
        BigInteger digitoControlIBAN = BigInteger.valueOf(98).subtract(Resto);
        DigitoControl = digitoControlIBAN.toString();

        if (DigitoControl.length() == 1) {
            DigitoControl = "0" + DigitoControl;
        }
        String resultado = "ES" + DigitoControl + entitat + oficina + dc + compte;
        return resultado;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }
}

