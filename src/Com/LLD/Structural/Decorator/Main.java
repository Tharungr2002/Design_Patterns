package Com.LLD.Structural.Decorator;

interface Pizza {
    void description();
    int price();
}

class PlainPizza implements Pizza {
    @Override
    public int price() {
        return 40;
    }
    @Override
    public void description() {
        System.out.println("plain pizza");
    }
}

class MargerittaPizza implements Pizza {
    @Override
    public int price() {
        return 50;
    }
    @Override
    public void description() {
        System.out.println("margeritta pizza");
    }
}

abstract class Decorator implements Pizza {
    Pizza pizza;

    Decorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class ExtraCheese extends Decorator {

    ExtraCheese(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int price() {
        return pizza.price() + 10;
    }
    @Override
    public void description() {
        pizza.description();
        System.out.println("with Extracheese pizza");
    }
}

class ExtraSpice extends Decorator {

    ExtraSpice(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int price() {
        return pizza.price() + 10;
    }
    @Override
    public void description() {
        pizza.description();
        System.out.println("with ExtraSpice pizza");
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza pizza= new MargerittaPizza();
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraSpice(pizza);
        pizza.description();
        System.out.println(pizza.price());

    }
}


