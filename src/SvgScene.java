import java.util.ArrayList;

public class SvgScene {
    private double width, height;
    private ArrayList<Shape> shapes;

    public SvgScene(double width, double height) {
        this.width = width;
        this.height = height;
        shapes = new ArrayList<>();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public SvgScene(){
        shapes = new ArrayList<>();

    }
    public String toSvg(){
        String beggining = "<svg height=\"" + height
                + "\" width=\"" + width
                + "\" xmlns=\"http://www.w3.org/2000/svg\">\n";
        String middle = "";
        for(Shape e : shapes){
            middle += "\t" + e.toSvg() + "\n";
        }
        String ending = "</svg>";
        return beggining + middle + ending;
    }
}
