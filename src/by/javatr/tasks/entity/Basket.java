package by.javatr.tasks.entity;

import by.javatr.tasks.exception.FullBasketException;
import by.javatr.tasks.exception.IncorrectIndexException;
import by.javatr.tasks.exception.NullBallException;
import by.javatr.tasks.exception.NullBasketException;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int MAX_BALLS = 30;
    private List<Ball> balls;

    public Basket(){
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return this.balls;
    }

    public void deleteBall(int index) throws IncorrectIndexException {
        if(index < 0 || index >= balls.size())
            throw new IncorrectIndexException("Ball with this index does not exist");

        balls.remove(index);
    }

    public Ball getBall(int index) throws IncorrectIndexException {

        if(index < 0 || index >= balls.size())
            throw new IncorrectIndexException("Ball with this index does not exist");

        Ball result = balls.get(index);
        return result;
    }

    public void addBalls(ArrayList<Ball> balls) throws NullBasketException, FullBasketException, NullBallException {
        if(balls == null)
            throw new NullBallException("Ball is null");

        for(Ball ball : balls)
            if(ball == null)
                throw new NullBallException("Ball is null");

        if( balls.size() + this.balls.size() > MAX_BALLS)
            throw new FullBasketException("Basket is full");

        this.balls.addAll(balls);
    }

    public void addOneBall(Ball ball) throws  FullBasketException, NullBallException {
        if(ball == null)
            throw new NullBallException("Ball is null");

        if( balls.size() + 1 > MAX_BALLS)
            throw new FullBasketException("Basket is full");

        this.balls.add(ball);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;

        return balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        return balls.hashCode();
    }
}
