
    public class FacturaIva implements Facturacion{
        @Override
        public void crearFactura(String mensaje) {
            System.out.println("la facura es con iva del 19%: " + mensaje);
        }
}
