package Clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 21/04/2017
 */
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArchivoTexto {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrir_archivo() {
        try {
            salida = new Formatter("Programadores.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregar_informacion() {
        // el archivo permite el ingreso
        // de edad, nombre, apellido de una persona

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) // itera hasta que bandera sea false
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar

                Programador programador1 = new Programador("Carlos Carrión", 1200);
                Programador programador2 = new Programador("Alexander Gomez", 2000);

                LenguajeProgramacion lenguaje1 = new LenguajeProgramacion("Python");
                LenguajeProgramacion lenguaje2 = new LenguajeProgramacion("Java");
                LenguajeProgramacion lenguaje3 = new LenguajeProgramacion("C++");

                Nomina nomina1 = new Nomina("1");

                // escribe el nuevo registro
                salida.format("\t************ Programadores ************\n");
                salida.format(nomina1 + "\n");
                salida.format("\nProgramador 1:\n");
                salida.format(programador1.toString() + "\nLenguajes: " + lenguaje1);

                salida.format("\n\nProgramador 2:\n");
                salida.format(programador2.toString() + "\nLenguajes:" + lenguaje2 + lenguaje3);

                System.out.println("Presione (2) para guardar archivo");
                int valor = entrada.nextInt();
                if (valor == 2) {
                    bandera = false;
                }

            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del método agregarRegistros

    // cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
} // fin de la clase ArchivoTexto

