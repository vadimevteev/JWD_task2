package by.javatr.tasks.runner;

import by.javatr.tasks.entity.Ball;
import by.javatr.tasks.entity.Basket;
import by.javatr.tasks.entity.Color;
import by.javatr.tasks.exception.FullBasketException;
import by.javatr.tasks.exception.NullBallException;
import by.javatr.tasks.exception.NullBasketException;
import by.javatr.tasks.exception.NullColorException;
import by.javatr.tasks.unit.BasketLogics;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String... args) {
        try {
        ArrayList<Ball> balls = new ArrayList<Ball>();
        Collections.addAll(balls,
                new Ball(30, Color.BLUE),
                new Ball(15.15, Color.RED),
                new Ball(8, Color.BLUE),
                new Ball(10, Color.YELLOW),
                new Ball(3, Color.PINK));

        Basket basket = new Basket();
        basket.addBalls(balls);
        int blueBallsAmount = BasketLogics.findBlueBalls(basket);
        double allWeight = BasketLogics.findSumWeight(basket);
        System.out.println("Amount of blue balls is " + blueBallsAmount
                    + "\nWeight of all balls in box is " + allWeight);
        }
        catch (NullBasketException | FullBasketException | NullBallException e){
            System.err.println(e.getMessage());
        }
    }

}
