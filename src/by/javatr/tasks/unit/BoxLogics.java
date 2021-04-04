package by.javatr.tasks.unit;

import by.javatr.tasks.entity.Ball;
import by.javatr.tasks.entity.Color;
import by.javatr.tasks.entity.Box;
import by.javatr.tasks.exception.EmptyBoxException;

public class BoxLogics {
    public static double findSumWeight(Box box) throws EmptyBoxException {
        if(box == null)
            throw new EmptyBoxException("Box is empty!");
        double sum = 0;
        for(Ball ball: box.getBalls())
            sum += ball.getWeight();
        return  sum;
    }

    public static int findBlueBalls(Box box) throws EmptyBoxException {
        if(box == null)
            throw new EmptyBoxException("Box is empty!");
        int amount = 0;
        for(Ball ball: box.getBalls())
            if(ball.getColor() == Color.BLUE)
                amount++;
        return amount;
    }
}
