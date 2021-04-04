package by.javatr.tasks.entity;

public class Ball {
    private double weight;
    private Color color;

    {
        this.weight = 0;
    }

    public Ball() {
        this.weight = 0;
        this.color = null;
    }

    public Ball(double weight, Color color) {
        if (weight > 0)
            this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight && color == ball.color;
    }

    @Override
    public int hashCode() {
        int result = 0;
        if(this.color != null)
            result = this.color.hashCode();
        result = 31 * result + (int)this.weight;
        return result;
    }
}
