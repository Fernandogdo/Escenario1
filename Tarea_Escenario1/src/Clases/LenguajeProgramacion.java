package Clases;

/**
 *
 * @author macbook
 */
public class LenguajeProgramacion {

    private String StrLenguaje;

    public LenguajeProgramacion() {

    }

    public LenguajeProgramacion(String StrLenguaje) {
        this.StrLenguaje = StrLenguaje;
    }

    public String getStrLenguaje() {
        return StrLenguaje;
    }

    @Override
    public String toString() {
        return "\n" + getStrLenguaje();

    }
}
