public class Triagle extends Shape {
    private double side1 = 1;
    private double side2 = 1;

    public Triagle() {
    }

    public Triagle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public Triagle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    private double side3 = 1;

    public boolean isValid() {
        if (((side1 + side2) > side3) &&
                ((side1 + side3) > side2) &&
                ((side3 + side2) > side1)) {
            return true;
        }
        return false;
    }


    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        if (!isValid()) {
            return "không phải 1 tam giác hợp lệ!";
        }
        return "Triagle:\n" +
                "+ chiều dài 3 cạnh: " +
                this.side1 + ", " +
                this.side2 + ", " +
                this.side3 + "\n" +
                "+ màu: " + this.getColor() + "\n" +
                "+ fill: " + this.isFilled() + "\n" +
                "+ chu vi: " + this.getPerimeter() + "\n" +
                "+ diện tích: " + this.getArea() + "\n";
    }
}