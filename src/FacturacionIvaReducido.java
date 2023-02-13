public class FacturacionIvaReducido implements Facturacion{

    @Override
    public void crearFactura(String mensaje) {
        System.out.println("la facura es con iva del 8%: " + mensaje);
    }
}
