public class Point {
    public double x;
    public double y;
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
}
