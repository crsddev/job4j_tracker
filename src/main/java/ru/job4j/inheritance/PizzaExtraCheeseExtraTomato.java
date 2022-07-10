package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private final String ingredient = " + extra tomato";

    public String name() {
        return super.name() + ingredient;
    }
}
