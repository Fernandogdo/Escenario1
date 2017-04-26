package Clases;

/**
 *
 * @author @authores Cristhian Apolo, Nelson Aranda y Fernando León 21/04/2017
 */
public class Nomina {

    private String StrNum_nomina;

    public Nomina() {

    }

    public Nomina(String StrNum_nomina) {
        this.StrNum_nomina = StrNum_nomina;
    }

    public String getStrNum_nomina() {
        return StrNum_nomina;
    }

    @Override
    public String toString() {
        return "\tNúmero nomina:" + getStrNum_nomina();
    }
}
