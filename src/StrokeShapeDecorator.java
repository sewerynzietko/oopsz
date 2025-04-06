import java.util.Locale;

public class StrokeShapeDecorator extends ShapeDecorator{
    private String color;
    private double width;

    public StrokeShapeDecorator(Shape decoratedShape, double width, String color) {
        super(decoratedShape);
        this.width = width;
        this.color = color;
    }

    @Override
    public String toSvg(String param) {
        String stroke = String.format(Locale.US,"stroke=\"%s\" stroke-width=\"%f\" ",color,width);
        return decoratedShape.toSvg(stroke + param);
    }
    @Override
    public String toSvg() {
        return toSvg("");
    }
}
