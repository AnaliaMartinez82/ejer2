import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instancio objeto de la clase Scanner y guardandolo en la variable scanner
        //*Scanner scanner = new Scanner(System.in);

        //*System.out.printf ("Decime tu nombre\n");
        //usando un metodo de la clase Scanner a traves de su instancia scanner
        //El metodo next() - lee la  linea ingresada por el usuario como string- es llamado por la instancia scanner
        //*String nombre = scanner.next();
        //*System.out.println("Hola"+ nombre);

        //*System.out.printf("Decime tu edad\n");

        // el metodo nextInt() lee lo ingresado por consola como un entero
        //*int edad=scanner.nextInt();
        //*int proximaEdad = edad+1;
        //*System.out.printf("Vas a cumplir "+ (proximaEdad));

        //*System.out.printf("ingresar un numero\n");
        //*Scanner scanner = new Scanner(System.in);
        //*Integer numero= scanner.nextInt();
        //*Integer multiplicacion = numero*2;
        //*System.out.printf("el doble del numero ingresado= "+ numero+ " es "+ multiplicacion);

        //Sentencia IF
        //*System.out.printf("Hola ingresa tu edad: ");
        //*int edad = scanner.nextInt();

        //*if edad(<1 || edad >130){
           //* System.out.printf("Ingresa una edad valida");
            //edad = scanner.nextInt();
        //*} else if (edad>18){
           //* System.out.printf("Podes pasar")
        //*} else {
           //* System.out.printf("No podes pasar");
        //*}

        //Ejercicio 1
        Scanner scanner = new Scanner(System.in);
        System.out.printf("elige un dia de la semana, para saber con que asignatura comienza ese dia");
        String diaDeSemana= scanner.next();
        String resultado;
        switch (diaDeSemana) {
            case "lunes":
                resultado="Matematicas";
                break;
            case "martes":
                resultado="Ciencias Sociales";
                break;
            case "miercoles":
                resultado="Ciencia Naturales";
                break;
            case "jueves":
                resultado="Literatura";
                break;
            case "viernes":
                resultado="Idioma";
                break;
            default:
                resultado= "No es dia de semana";
        }
        System.out.printf("El dia "+ diaDeSemana + " comienza con la materia "+ resultado);
    }
}