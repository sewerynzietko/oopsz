public class SolidFillShapeDecorator extends ShapeDecorator{
   private String color;

    public SolidFillShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    public String toSvg(String param) {
        String fill = String.format("fill=\"%s\" ", color);
        return decoratedShape.toSvg(fill + param);
    }

    public String toSvg() {
        return toSvg("");
    }

}
