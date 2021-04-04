package by.javatr.tasks.entity;

import java.util.ArrayList;

public class Box {
   ArrayList<Ball> balls;

    public Box(){
        this.balls = new ArrayList<>();
    }

    public Box(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public ArrayList<Ball> getBalls() {
        return this.balls;
    }

    public void deleteBall(Ball ball){
        balls.remove(ball);
    }

    public void addBalls(ArrayList<Ball> balls) {
        this.balls.addAll(balls);
    }

    public void addOneBall(Ball ball){
        this.balls.add(ball);
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;

        return balls.equals(box.balls);
    }

    @Override
    public int hashCode() {
        return balls.hashCode();
    }
}
