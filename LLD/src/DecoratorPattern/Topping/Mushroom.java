package src.DecoratorPattern.Topping;

import src.DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator {

    public Mushroom(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }

}
