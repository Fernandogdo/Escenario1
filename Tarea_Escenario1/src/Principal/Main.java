package Principal;

import Clases.ArchivoTexto;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 21/04/2017
 */
public class Main {

    public static void main(String args[]) {
        ArchivoTexto aplicacion = new ArchivoTexto();

        aplicacion.abrir_archivo();
        aplicacion.agregar_informacion();
        aplicacion.cerrar_archivo();
    }
}
