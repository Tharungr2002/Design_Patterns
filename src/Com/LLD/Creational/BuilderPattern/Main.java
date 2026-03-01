package Com.LLD.Creational.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        BurgerMeal obj1= new BurgerMeal.Burgerbuilder("bun","veg").withCheese(true).build();
    }
}
