package src.DecoratorPattern.Topping;

import src.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    public ExtraCheese(BasePizza basePizza)
    {
        this.basePizza= basePizza;
    }

    @Override
    public int cost() {
       return this.basePizza.cost()+10;
    }

}
