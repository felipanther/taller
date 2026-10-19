public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = 0.0;
        establecerSalarioMensual(salarioMensual);
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerSalarioMensual(double salario) {
        if (salario > 0) {
            salarioMensual = salario;
        }
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }
}