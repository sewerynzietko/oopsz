public class Point {
    private double x;
    private double y;
    public String toString(){
        return "P(x,y) = " + "(" + x + ", " + y + ")";
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
}
