package TemplateMethodJava;

public class PepperoniPizza extends Pizza{
    @Override
    protected void addToppings() {
        System.out.println("Adding pepperoni");
    }

}
