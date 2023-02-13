public class Main {
    public static void main(String[] args)
    {
        /*Notificacion notificacion = FabricaNotificacion.obtenerNotificacion("CORREO");
        notificacion.notificarUsuario("hola usuario");*/

        Facturacion facturacion = FabricaFacturacion.obtenerFacturacion("IVA");
        facturacion.crearFactura("mensaje IVA");

        Facturacion facturacion1 = FabricaFacturacion.obtenerFacturacion("IVAREDUCIDO");
        facturacion1.crearFactura("mensaje IVAREDUCIDO");
    }
}