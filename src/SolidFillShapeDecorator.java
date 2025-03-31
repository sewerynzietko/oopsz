public class SolidFillShapeDecorator extends ShapeDecorator{
   private String color;

    public SolidFillShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    public String toSvg(Shape decoratedShape, String param) {
        return decoratedShape.toSvg("style=\"fill:" + color + "\"");
    }
}
