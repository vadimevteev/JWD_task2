package by.javatr.tasks.unit;

import by.javatr.tasks.entity.Ball;
import by.javatr.tasks.entity.Color;
import by.javatr.tasks.entity.Basket;
import by.javatr.tasks.exception.NullBasketException;

public class BasketLogics {
    public static double findSumWeight(Basket basket) throws NullBasketException {

        if(basket == null)
            throw new NullBasketException("Basket is null!");

        double sum = 0;
        for(Ball ball: basket.getBalls())
            sum += ball.getWeight();

        return  sum;
    }

    public static int findBlueBalls(Basket box) throws NullBasketException {

        if(box == null)
            throw new NullBasketException("Basket is null!");

        int amount = 0;
        for(Ball ball: box.getBalls())
            if(ball.getColor() == Color.BLUE)
                amount++;

        return amount;
    }
}
