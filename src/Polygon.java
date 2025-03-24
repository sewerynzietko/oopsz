import java.util.ArrayList;

public class Polygon extends Shape{
    private ArrayList<Point> points;

    public Polygon(Style gangnam) {
        super(gangnam);
    }

    public Polygon(ArrayList<Point> points) {
        super();
        this.points = points;
    }

    public Polygon(ArrayList<Point> points, Style gangnam) {
        super(gangnam);
        this.points = points;
    }

    public static Polygon createSquare(Segment s, Style style){
        ArrayList<Point> points = new ArrayList<>();
        points.add(s.getStart());
        points.add(s.getEnd());
        //Segment perpendicularSegment = s.findPerpendicular();
        //points.add(perpendicularSegment.getStart());
        //points.add(perpendicularSegment.getEnd());
        return new Polygon(points, style);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
    public String toSvg() {
        String beginning =  "<polygon points=\"";

        String middle = "";
        for(Point p : points) {
            middle += p.getX() + "," + p.getY() + " ";
        }

        String ending = "\" " +
                gangnam.toSvg() +
                "\"/>\n";

        return beginning + middle + ending;
    }
}

