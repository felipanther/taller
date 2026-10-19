import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) {
        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes:"));

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el día:"));

        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año:"));

        Fecha fecha = new Fecha(mes, dia, anio);

        JOptionPane.showMessageDialog(null,
                "La fecha ingresada es: " + fecha.mostrarFecha());

        // Demostrar los métodos establecer:
        fecha.establecerMes(12);
        fecha.establecerDia(25);

        JOptionPane.showMessageDialog(null,
                "Fecha modificada: " + fecha.mostrarFecha());
    }
}