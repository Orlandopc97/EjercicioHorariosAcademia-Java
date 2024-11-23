import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables
        int edad;
        Scanner teclado = new Scanner(System.in);

        //Bienvenida y peticion de dato "edad"
        System.out.println("************BIENVENIDO A ENGLISH SCHOLL************");
        System.out.println("Ingrese la edad del alumno:");
        edad = teclado.nextInt();

        //validacion de edad para horario
        if(edad >= 4 && edad <= 6){
            System.out.println("El horario para KINDER es: LUNES y MIÉRCOLES de 16 a 15 HRS");

        } else if (edad >= 7 && edad <= 8 ) {
            System.out.println("El horario para 1st YEAR es: MARTES y JUEVES de 16:30 a 17:30 HRS");

        }else if (edad >= 9 && edad <= 10) {
            System.out.println("El horario para 2nd YEAR es: MARTES y JUEVES de 17:30 a 19 HRS");
        } else if (edad >= 11 && edad <= 13) {
            System.out.println("El horario para 3rd YEAR es: LUNES y MIÉRCOLES de 17 a 18:30 HRS");
        }else {
            System.out.println("INGRESASTE UNA EDAD QUE NO CORRESPONDE, NO EXISTE HORARIOS");
        }
    }
}
/*
    Un instituto de inglés desea informar a sus alumnos los dias y horarios de sus clases. Para
    ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno,
    le informe en que dias y horarios los alumnos tienen clases.

    Como información, la academia proporciona los siguientes datos respecto a los grupos y
    los diferentes horarios:

    -Kinder (de 4 a 6 años inclusive):
        -Lunes y Miércoles de 16 a 17

    -1st year (de 7 a 8 años inclusive):
        -Martes y Jueves de 16:30 a 17:30

    -2nd year (de 9 a 10 años inclusive):
        -Martes y Jueves de 17:30 a 19

    -3rd year (de 11 a 13 años inclusive):
        -Lunes y Miércoles de 17 a 18:30

    Realizar el programa solicitado por el instituto, donde a partir del ingreso de la edad del
    alumno, el sistema informe por pantalla los dias y horarios de cursada.


 */