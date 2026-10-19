import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Año de nacimiento: ");
        int anio = entrada.nextInt();

        FrecuenciasCardiacas persona =
                new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        double[] rango = persona.calcularFrecuenciaEsperada();

        System.out.println("\nINFORMACIÓN PERSONAL");
        System.out.println("Nombre: " + persona.obtenerNombre()
                + " " + persona.obtenerApellido());
        System.out.println("Fecha de nacimiento: "
                + persona.obtenerFechaNacimiento());
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia cardiaca máxima: "
                + persona.calcularFrecuenciaMaxima() + " pulsos/minuto");

        System.out.printf("Rango esperado: %.1f - %.1f pulsos/minuto%n",
                rango[0], rango[1]);

        entrada.close();
    }
}