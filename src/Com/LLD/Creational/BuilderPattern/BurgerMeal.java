package Com.LLD.Creational.BuilderPattern;

import java.util.List;

public class BurgerMeal {
    private String bunType;
    private String patty;

    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side;
    private final String drink;

    public BurgerMeal(Burgerbuilder burgerbuilder) {
        this.bunType = burgerbuilder.bunType;
        this.patty = burgerbuilder.patty;
        this.hasCheese = burgerbuilder.hasCheese;
        this.toppings = burgerbuilder.toppings;
        this.side = burgerbuilder.side;
        this.drink = burgerbuilder.drink;
    }

    public static class Burgerbuilder {
        private String bunType;
        private String patty;

        private boolean hasCheese;
        private List<String> toppings;
        private String side;
        private String drink;

        public Burgerbuilder(String bunType, String patty) {
            this.bunType= bunType;
            this.patty = patty;
        }

        public Burgerbuilder withCheese(boolean b) {
            this.hasCheese= b;
            return this;
        }

        public Burgerbuilder withToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Burgerbuilder withSide(String side) {
            this.side = side;
            return this;
        }

        public Burgerbuilder withDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public BurgerMeal build() {
            return new BurgerMeal(this);
        }

    }
}
