import javax.swing.JOptionPane;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(
                "Ingrese su primer nombre:");

        String apellido = JOptionPane.showInputDialog(
                "Ingrese su apellido:");

        String sexo = JOptionPane.showInputDialog(
                "Ingrese su sexo:");

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Día de nacimiento:"));

        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Mes de nacimiento:"));

        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Año de nacimiento:"));

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Altura en centímetros:"));

        double peso = Double.parseDouble(
                JOptionPane.showInputDialog("Peso en kilogramos:"));

        PerfilMedico persona = new PerfilMedico(
                nombre, apellido, sexo, dia, mes, anio, altura, peso);

        double bmi = persona.calcularBMI();
        double[] rango = persona.calcularFrecuenciaEsperada();

        String resultado = "PERFIL MÉDICO\n"
                + "Nombre: " + persona.obtenerNombre()
                + " " + persona.obtenerApellido()
                + "\nSexo: " + persona.obtenerSexo()
                + "\nFecha de nacimiento: "
                + persona.obtenerFechaNacimiento()
                + "\nAltura: " + persona.obtenerAltura() + " cm"
                + "\nPeso: " + persona.obtenerPeso() + " kg"
                + "\nEdad: " + persona.calcularEdad() + " años"
                + String.format("\nBMI: %.2f", bmi)
                + "\nCategoría BMI: " + persona.obtenerCategoriaBMI()
                + "\nFrecuencia cardiaca máxima: "
                + persona.calcularFrecuenciaMaxima() + " pulsos/minuto"
                + String.format(
                "\nRango esperado: %.1f - %.1f pulsos/minuto",
                rango[0], rango[1])
                + "\n\nTABLA DE VALORES BMI"
                + "\nBajo peso: menos de 18.5"
                + "\nNormal: entre 18.5 y 24.9"
                + "\nSobrepeso: entre 25 y 29.9"
                + "\nObeso: 30 o más";

        JOptionPane.showMessageDialog(null, resultado);
    }
}