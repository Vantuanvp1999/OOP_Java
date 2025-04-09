public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed1) {
        return this.speed = speed1;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius1) {
        this.radius = radius1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color1) {
        this.color = color1;
    }

    public String toString() {
        if (on) {
            return "Fan is on: speed=" + speed + ", radius=" + radius + ", color=" + color;

        } else {
            return "Fan is off: radius=" + radius + ", color=" + color;
        }
    }
}
