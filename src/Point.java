public class Point {
    private double x;
    private double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public String toSvg(){
        return "<svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "<circle r=\"45\" cx=\"" +
                x +
                "\" cy=\"" +
                y +
                "\" fill=\"red\" />\n" +
                "</svg> ";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }

    public Point(Point toCopy){
        this.x = toCopy.getX();
        this.y = toCopy.getY();
    }
}
