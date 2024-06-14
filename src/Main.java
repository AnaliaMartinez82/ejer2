import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    ArrayList<String> nombres= new ArrayList<String>();
    public static void main(String[] args) {
        ArrayList<String> nombres= new ArrayList<String>();

        nombres.add("Dario C.");
        nombres.add("Marcelo L.");
        nombres.add("Marta P.");
        nombres.add("Rosario T.");

        System.out.println("Lista de contactos guardados");
        // en una sola linea:
        // nombres.forEach(System.out::println);
        nombres.forEach(contacto ->
                System.out.println(contacto));

        System.out.println("infrome que accion desea realizar: \n");
        System.out.println("1 añadir un nuevo contacto \n"+"2 busqueda de un contacto y ver telefono\n"+"3 Borrar un contacto por su nombre\n");
        String accion= Scanner.next (System.in);
        switch (accion){
            case 1:
                //sentencia
                break;
        }


    }


}