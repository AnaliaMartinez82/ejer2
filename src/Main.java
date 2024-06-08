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
        //*Scanner scanner = new Scanner(System.in);
        //*System.out.printf("elige un dia de la semana, para saber con que asignatura comienza ese dia");
        //*String diaDeSemana= scanner.next();
        //*String resultado;
        //*switch (diaDeSemana) {
           //* case "lunes":
              //*resultado="Matematicas";
                //*break;
            //*case "martes":
               //* resultado="Ciencias Sociales";
               //* break;
            //*case "miercoles":
                //*resultado="Ciencia Naturales";
                //*break;
            //*case "jueves":
                //*resultado="Literatura";
                //*break;
            //*case "viernes":
                //*resultado="Idioma";
                //*break;
            //*default:
                //*resultado= "No es dia de semana";
        //*}
        //*System.out.printf("El dia "+ diaDeSemana + " comienza con la materia "+ resultado);

        //EJERCICIO2
        //*Scanner scanner = new Scanner(System.in);
        //*System.out.printf("por favor indique la hora actual de 0 a 23 (sin minutos)\n");
        //*int hora = scanner.nextInt();
        //*String saludo;
        //*switch (hora){
            //*case 6,7,8,9,10,11,12:
                //*saludo = "Buenos Dias";
                //*break;
            //*case 13,14,15,16,17,18,19,20:
                //*saludo = "Buenas Tardes";
                //*break;
            //*case 21,22,23,0,1,2,3,4,5:
                //*saludo = "Buenas Noches";
                //*break;
            //*default:
                //*saludo= "Se solicito ingresar horario de 0 a 23, por ende, No corresponde a las horas que contiene un dia terrestre";
        //*}
        //*System.out.println(saludo);

        //EJERCICIO 3
        //*Scanner scanner = new Scanner(System.in);
        //*System.out.println("Digite un numero del 1 al 7, para saber que dia de la semana que elige \n");
        //*int num = scanner.nextInt();
        //*String diaSemanal;
        //*switch (num){
            //*case 1:
                //*diaSemanal="Lunes";
                //*break;
            //*case 2:
                //*diaSemanal="Martes";
                //*break;
            //*case 3:
                //*diaSemanal="Miercoles";
                //*break;
            //*case 4:
                //*diaSemanal="Jueves";
                //*break;
            //*case 5:
                //*diaSemanal="Viernes";
                //*break;
            //*case 6:
                //*diaSemanal="Sabado";
                //*break;
            //*case 7:
                //*diaSemanal="Domingo";
                //*break;
            //*default:
                //*diaSemanal="No corresponde a la consigna";
        //*}
        //*System.out.println("Usted eligio el numero: "+num+" que corresponde al dia: "+diaSemanal);

        //Ejercico N°4
        //*Scanner scanner= new Scanner(System.in);
        //*System.out.println("Por favor ingrese 3 notas para promediar");
        //*Integer a = scanner.nextInt();
        //*Integer b = scanner.nextInt();
        //*Integer c = scanner.nextInt();
        //*double promedio = (a+b+c)/3;
        //*System.out.println("El promedio de las notas ingresada es = "+promedio);

        //EJERCICIO N°5
        //*Scanner scanner= new Scanner(System.in);
        //*System.out.println("Calcularemos los segundos faltantes para llegar a medianoche.\nCon el formato horario de 24hs (0-23hs).\nPor favor escriba solo la hora (luego solicitaremos los minutos) ");
        //*int hora= scanner.nextInt();
        //*System.out.println("Por favor ingrese los minutos");
        //*int min= scanner.nextInt();
        //*int horaEnSeg= (hora*60*60);
        //*int minEnSeg= (min*60);
        //*int tiempoActualEnSeg= (horaEnSeg+minEnSeg);
        //*int mediaNocheEnSeg= (24*60*60);
        //*int segFaltanteMediaNoche= (mediaNocheEnSeg-tiempoActualEnSeg);
        //*System.out.println("El horario actual que ha registrado es "+ hora +":"+ min + ", por lo que faltan "+ segFaltanteMediaNoche+" segundos para llegar a medianoche");

        //EJERCICIO N°6
        //*Scanner scanner = new Scanner(System.in);
        //*System.out.println("Por favor ingresar tres numeros enteros\n");
        //*int a= scanner.nextInt();
        //*int b= scanner.nextInt();
        //*int c= scanner.nextInt();
        //*int mayor;
        //*int medio;
        //*int menor;
        //*if ((a>b) && (a>c)){
            //*mayor= a;
            //*if (b>c){
                //*medio= b;
                //*menor= c;
            //*} else {
                //*medio= c;
                //*menor= b;
            //*}
        //*} else if ((b>a) && (b>c)){
            //*mayor= b;
            //*if (c>a){
                //*medio=c;
                //*menor=a;
            //*} else {
                //*medio=a;
                //*menor=c;
            //*}
        //*} else {
            //*mayor=c;
            //*if (a>b){
                //*medio=a;
                //*menor=b;
            //*}else {
                //*medio=b;
                //*menor=a;
            //*}
        //*}
        //*System.out.println("indique como desea que se visualice el orden de los numeros, tecla: 1(=creciente), 2(=decreciente)\n");
        //*int orden= scanner.nextInt();
        //*switch (orden){
            //*case 1:
                //*System.out.println("Los numeros ingresados en orden creciente: "+menor+", "+medio+", "+mayor);
                //*break;
            //*case 2:
                //*System.out.println("Los numeros ingresados en orden decreciente: "+mayor +", "+medio+", "+menor);
                //*break;
            //*default:
                //*System.out.println("Lo siento, No se puede procesar, ya que no corresponde a las indicaciones solicitadas");
        //*}

        //EJERCICIO N°7
        Scanner scanner= new Scanner(System.in);
        Double sueldoPJunior= 950.0;
        Double sueldoPSenior= 1200.0;
        Double sueldoJefeProyec= 1600.0;
        Double dietaViajeDia= 30.0;
        Double soltero= 0.25;
        Double casado= 0.20;
        Double salario= 0.0;
        Double salarioFinal=0.0;
        Double restarPorcentaje;
        System.out.println("Podria indicar su cargo 1=Prog.Junior, 2=Prog.Senior, 3=Jefe de proyecto");
        int cargo= scanner.nextInt();
        switch (cargo){
            case 1:
                System.out.println("Podria indicar cuantos dias ha estado visitando clientes (0-cero- si no ha viajado)\n");
                int diaCant= scanner.nextInt();
                System.out.println("por favor indique su estado civil: 1(=casado), 2(=soltero)");
                int estadoCivil= scanner.nextInt();
                if (estadoCivil==1){
                    salario=(sueldoPJunior + dietaViajeDia * diaCant);
                    restarPorcentaje= salario * casado;
                    salarioFinal= salario - restarPorcentaje;
                }else if (estadoCivil==2){
                    salario=(sueldoPJunior + dietaViajeDia * diaCant);
                    restarPorcentaje= salario * soltero;
                    salarioFinal= salario - restarPorcentaje;
                }
                break;
            case 2:
                System.out.println("Podria indicar cuantos dias ha estado visitando clientes (0-cero- si no ha viajado)\n");
                diaCant = scanner.nextInt();
                System.out.println("por favor indique su estado civil: 1(=casado), 2(=soltero)");
                estadoCivil= scanner.nextInt();
                if (estadoCivil==1){
                    salario=(sueldoPSenior + dietaViajeDia * diaCant);
                    restarPorcentaje= salario * casado;
                    salarioFinal= salario - restarPorcentaje;
                }else if (estadoCivil==2){
                    salario=(sueldoPSenior + dietaViajeDia * diaCant);
                    restarPorcentaje= salario * soltero;
                    salarioFinal= salario - restarPorcentaje;
                }
                break;
            case 3:
                System.out.println("Podria indicar cuantos dias ha estado visitando clientes (0-cero- si no ha viajado)\n");
                diaCant= scanner.nextInt();
                System.out.println("por favor indique su estado civil: 1(=casado), 2(=soltero)");
                estadoCivil= scanner.nextInt();
                if (estadoCivil==1){
                    salario=(sueldoJefeProyec + dietaViajeDia * diaCant);
                    restarPorcentaje= salario * casado;
                    salarioFinal= salario - restarPorcentaje;
                }else if (estadoCivil==2){
                    salario=(sueldoJefeProyec + dietaViajeDia * diaCant);
                    restarPorcentaje= salario * soltero;
                    salarioFinal= salario - restarPorcentaje;
                }
                break;
            default:
                System.out.println("Disculpe, la opcion elegida no corresponde a lo que se ha solicitado");
        }
        System.out.println("Su sueldo neto con los descuentos aplicados segun su estado civil es = $ "+ salarioFinal);




    }
}