package src.DecoratorPattern;

import src.DecoratorPattern.Pizza.BasePizza;
import src.DecoratorPattern.Pizza.VegDelightPizza;
import src.DecoratorPattern.Topping.ExtraCheese;
import src.DecoratorPattern.Topping.Mushroom;

public class Main {
    public static void main()
    {
        //lets create a veggie delight pizza with extra cheese
        BasePizza pizza = new ExtraCheese(new VegDelightPizza());
        System.out.println("Cost of veg delight pizza with extra cheese : "+pizza.cost());

        //add mushroom 
        pizza = new Mushroom(pizza);
        System.out.println("Cost of veg delight pizza with extra cheese and mushroom : "+pizza.cost());
    }
}
