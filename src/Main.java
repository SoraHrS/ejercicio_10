import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double patrimonio, pagoMatricula = 50000;
       int numeroInscripcion, estrato;
       String nombre;
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.US);
       System.out.println("Ingrese el numero de inscripcion del estudiante: ");
       numeroInscripcion = sc.nextInt();
       sc.nextLine();
       System.out.println("Ingrese el nombre del estudiante: ");
       nombre = sc.nextLine();
       System.out.println("Ingrese el patrimonio del estudiante: ");
       patrimonio = sc.nextDouble();
       System.out.println("Ingrese el estrato social del estudiante: ");
       estrato = sc.nextInt();

       if (patrimonio > 2000000 && estrato > 3) {
           pagoMatricula = pagoMatricula + 0.03*patrimonio;
       }
       System.out.println("El estudiante con número de incripción " + numeroInscripcion + " y nombre " + nombre + " debe pagar: $" + pagoMatricula );
    }
}