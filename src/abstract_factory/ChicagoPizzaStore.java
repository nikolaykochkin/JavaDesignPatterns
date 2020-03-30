package abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
        }
        return pizza;
    }
}
