import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("DATOS DEL EMPLEADO 1");
        System.out.print("Nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido1 = entrada.nextLine();
        System.out.print("Salario mensual: ");
        double salario1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("\nDATOS DEL EMPLEADO 2");
        System.out.print("Nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido2 = entrada.nextLine();
        System.out.print("Salario mensual: ");
        double salario2 = entrada.nextDouble();

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        System.out.printf("%nSalario anual de %s %s: $%.2f%n",
                empleado1.obtenerNombre(), empleado1.obtenerApellido(),
                empleado1.obtenerSalarioAnual());

        System.out.printf("Salario anual de %s %s: $%.2f%n",
                empleado2.obtenerNombre(), empleado2.obtenerApellido(),
                empleado2.obtenerSalarioAnual());

        empleado1.establecerSalarioMensual(
                empleado1.obtenerSalarioMensual() * 1.10);

        empleado2.establecerSalarioMensual(
                empleado2.obtenerSalarioMensual() * 1.10);

        System.out.println("\nDespués del aumento del 10%:");

        System.out.printf("%s %s: $%.2f anuales%n",
                empleado1.obtenerNombre(), empleado1.obtenerApellido(),
                empleado1.obtenerSalarioAnual());

        System.out.printf("%s %s: $%.2f anuales%n",
                empleado2.obtenerNombre(), empleado2.obtenerApellido(),
                empleado2.obtenerSalarioAnual());

        entrada.close();
    }
}