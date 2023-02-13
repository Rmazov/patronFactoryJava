package TemplateMethodJava;


public abstract class Pizza {
    public final void makePizza() {
        prepareDough();
        addToppings();
        bakePizza();
        cutPizza();
    }

    protected void prepareDough() {
        System.out.println("Preparing dough");
    }

    protected abstract void addToppings();

    protected void bakePizza() {
        System.out.println("Baking pizza");
    }

    protected void cutPizza() {
        System.out.println("Cutting pizza");
    }
}


