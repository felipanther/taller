import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(
                "Ingrese el número de pieza:");
        String descripcion = JOptionPane.showInputDialog(
                "Ingrese la descripción:");

        int cantidad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad:"));

        double precio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el precio por artículo:"));

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        String resultado = "FACTURA\n"
                + "Número de pieza: " + factura.obtenerNumeroPieza()
                + "\nDescripción: " + factura.obtenerDescripcionPieza()
                + "\nCantidad: " + factura.obtenerCantidad()
                + "\nPrecio: $" + factura.obtenerPrecioPorArticulo()
                + "\nMonto total: $" + factura.obtenerMontoFactura();

        JOptionPane.showMessageDialog(null, resultado);
    }
}