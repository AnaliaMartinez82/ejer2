package practicaEjercicio;

import java.util.Scanner;
//Escribir un programa que pida por teclado un dia de semana
//y que diga que asignatura le toca aprimera hora
public class Ejercicio1ScannerIfSwitch {
    public static void main(String[]args) {
    //Ejercicio 1
        Scanner scanner = new Scanner(System.in);
            System.out.print("elige un dia de la semana, para saber con que asignatura comienza ese dia");
            String diaDeSemana= scanner.next().toLowerCase();
            String resultado;
            switch (diaDeSemana) {
                case "lunes":
                    resultado = "Matematicas";
                    break;
                case "martes":
                    resultado = "Ciencias Sociales";
                    break;
                case "miercoles":
                    resultado = "Ciencia Naturales";
                    break;
                case "jueves":
                    resultado = "Literatura";
                    break;
                case "viernes":
                    resultado = "Idioma";
                    break;
                default:
                    resultado = "No es dia de semana";
                    break;
            }
            System.out.print("El dia "+ diaDeSemana + " comienza con la materia "+ resultado);

    }

}
