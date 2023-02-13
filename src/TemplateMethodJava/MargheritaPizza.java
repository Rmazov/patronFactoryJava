package TemplateMethodJava;

public class MargheritaPizza extends Pizza{


    @Override
    protected void addToppings() {
        System.out.println("Adding tomato and cheese");
  
    }
}
