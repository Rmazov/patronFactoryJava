package TemplateMethodJava;

public class Main {
    public static void main(String[] args)
    {
        /*Notificacion notificacion = FabricaNotificacion.obtenerNotificacion("CORREO");
        notificacion.notificarUsuario("hola usuario");*/

        Pizza pepperoniPizza = new PepperoniPizza();
        pepperoniPizza.makePizza();

        System.out.println("-----------------");

        Pizza margheritaPizza = new MargheritaPizza();
        margheritaPizza.makePizza();
    }

}
