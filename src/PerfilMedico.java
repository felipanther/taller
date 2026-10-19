import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura; // centímetros
    private double peso;   // kilogramos

    public PerfilMedico(String nombre, String apellido, String sexo,
                        int dia, int mes, int anio,
                        double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        diaNacimiento = dia;
        mesNacimiento = mes;
        anioNacimiento = anio;
        this.altura = altura;
        this.peso = peso;
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

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }

    public String obtenerSexo() {
        return sexo;
    }

    public void establecerDiaNacimiento(int dia) {
        diaNacimiento = dia;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerMesNacimiento(int mes) {
        mesNacimiento = mes;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerAnioNacimiento(int anio) {
        anioNacimiento = anio;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    public double obtenerPeso() {
        return peso;
    }

    public String obtenerFechaNacimiento() {
        return diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento;
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

        return new double[] {
                maxima * 0.50,
                maxima * 0.85
        };
    }

    public double calcularBMI() {
        double alturaMetros = altura / 100.0;

        return peso / (alturaMetros * alturaMetros);
    }

    public String obtenerCategoriaBMI() {
        double bmi = calcularBMI();

        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}