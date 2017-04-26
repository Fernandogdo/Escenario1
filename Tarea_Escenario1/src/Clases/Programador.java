package Clases;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class Programador {

    private final String StrNombre;
    private final double DblSalario_mensual;
    private ArrayList<LenguajeProgramacion> Lstlenguajes;

    public Programador(String StrNombre, double DblSalario_mensual) {
        this.StrNombre = StrNombre;
        this.DblSalario_mensual = DblSalario_mensual;
        ArrayList<LenguajeProgramacion> len = new ArrayList<>();
        this.Lstlenguajes = len;
    }

    public String getStrNombre() {
        return StrNombre;
    }

    public double getDblSalario_mensual() {
        return DblSalario_mensual;
    }

    public void agregarLenguaje(LenguajeProgramacion len) {
        this.Lstlenguajes.add(len);
    }

    public String getLenguajes() {
        String descripcion = "";

        //Ciclo retorna Lenguaje de Programaciónß
        for (int i = 0; i < Lstlenguajes.size(); i++) {
            System.out.println("Lenguaje " + (i + 1) + ":" + this.Lstlenguajes.get(i));
        }
        return descripcion;
    }

    @Override
    public String toString() {
        return "Nombre: " + getStrNombre() + "\nSalario Mensual: " + getDblSalario_mensual() + getLenguajes();
    }
}
