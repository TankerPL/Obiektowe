class Restaurant {
    private MealBuilder builder = null;

    void prepareMeal(MealBuilder builder) {
        this.builder = builder;
        builder.prepareMeal();
    }

    void serve() {
        builder.serve();
    }
}

abstract class MealBuilder {
    Meal meal = null;

    MealBuilder() {
        meal = new Meal();
    }

    void serve() {
        meal.serve();
    }

    public abstract void prepareMeal();
}

class Meal {
    private String type = null;
    private String[] ingredients = null;

    void prepareMeal(String type, String... ingredients) {
        this.type = type;
        this.ingredients = ingredients;
    }

    void serve() {
        System.out.printf("--- %s ---\n%s\n\n", type, String.join("\n", ingredients));
    }
}

class Breakfast extends MealBuilder {
    public void prepareMeal() {
        meal.prepareMeal("Breakfast", "eggs", "bacon", "sausage");
    }
}

class Dinner extends MealBuilder {
    public void prepareMeal() {
        meal.prepareMeal("Dinner", "breaded pork chop", "potatoes", "lettuce");
    }
}

class Supper extends MealBuilder {
    public void prepareMeal() {
        meal.prepareMeal("Supper", "bread", "ham", "cheese", "tomatoes");
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        MealBuilder breakfast = new Breakfast();
        MealBuilder dinner = new Dinner();
        MealBuilder supper = new Supper();

        restaurant.prepareMeal(breakfast);
        restaurant.serve();

        restaurant.prepareMeal(dinner);
        restaurant.serve();

        restaurant.prepareMeal(supper);
        restaurant.serve();
    }
}