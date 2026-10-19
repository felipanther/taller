import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido,
                                int mes, int dia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        mesNacimiento = mes;
        diaNacimiento = dia;
        anioNacimiento = anio;
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

    public void establecerMesNacimiento(int mes) {
        mesNacimiento = mes;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerDiaNacimiento(int dia) {
        diaNacimiento = dia;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerAnioNacimiento(int anio) {
        anioNacimiento = anio;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public String obtenerFechaNacimiento() {
        return mesNacimiento + "/" + diaNacimiento + "/" + anioNacimiento;
    }

    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(
                anioNacimiento, mesNacimiento, diaNacimiento);

        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double[] calcularFrecuenciaEsperada() {
        int maxima = calcularFrecuenciaMaxima();

        double inferior = maxima * 0.50;
        double superior = maxima * 0.85;

        return new double[] { inferior, superior };
    }
}
