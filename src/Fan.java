public class Fan {


    public static void main(String[] args) {
        Fan1 fan1 = new Fan1();
        fan1.setSpeed(Fan1.FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());
        Fan1 fan2 = new Fan1();
        fan2.setSpeed(Fan1.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
    public static class Fan1{
        public static final int SLOW =1;
        public static final int MEDIUM =2;
        public static final int FAST =3;

        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5.0;
        private String color = "blue";

    public Fan1() {}
    public int getSpeed() {
        return speed;
    }
    public int setSpeed(int speed1) {
        return this.speed=speed1;
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

        }else {
            return "Fan is off: radius=" + radius + ", color=" + color;
        }
    }
    }
}
