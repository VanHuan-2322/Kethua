public class Test {
    public static void main(String[] args) {
        Point point = new Point(20, 30);
        System.out.println(point.toString());
        point.setXY(10, 20);
        System.out.println(point.toString());
        point = new MoveAblePoint(point.getX(), point.getY(), 10, 20);
        System.out.println(point.toString());

        System.out.println(point.toString());
        MoveAblePoint anotherPoint = new MoveAblePoint(20, 20);
        System.out.println(anotherPoint.toString());

        System.out.println(anotherPoint.toString());
    }
}
