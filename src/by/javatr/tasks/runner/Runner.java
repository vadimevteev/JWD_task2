package by.javatr.tasks.runner;

import by.javatr.tasks.entity.Ball;
import by.javatr.tasks.entity.Color;
import by.javatr.tasks.entity.Box;
import by.javatr.tasks.exception.EmptyBoxException;
import by.javatr.tasks.unit.BoxLogics;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String... args){

        ArrayList<Ball> balls = new ArrayList<Ball>();
        Collections.addAll(balls,
                new Ball(30, Color.BLUE),
                new Ball(15.15, Color.RED),
                new Ball(8, Color.BLUE),
                new Ball(10, Color.YELLOW),
                new Ball(3, Color.PINK));

        Box box = new Box(balls);

        try {
            int blueBallsAmount = BoxLogics.findBlueBalls(box);
            double allWeight = BoxLogics.findSumWeight(box);
            System.out.println(new Ball().hashCode());
            System.out.println("Amount of blue balls is " + blueBallsAmount
                    + "\nWeight of all balls in box is " + allWeight);
        }
        catch (EmptyBoxException e){
            System.err.println(e.getMessage());
        }
    }

}
