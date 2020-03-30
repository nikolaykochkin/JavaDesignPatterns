package abstract_factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
        }
        return pizza;
    }
}
