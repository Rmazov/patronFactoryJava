public class FabricaFacturacion {

    public static Facturacion obtenerFacturacion(String tipo){
        switch (tipo) {
            case "IVA":
                return new FacturaIva();
            case "IVAREDUCIDO":
                return new FacturacionIvaReducido();

            default:
                return new FacturaIva();
        }
    }
}
