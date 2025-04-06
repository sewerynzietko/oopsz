import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
/*
        Point start = new Point(0,40);
        Point end = new Point(30,70);
        Segment line = new Segment(new Point(start), new Point(end));
        start.setY(200);
*/
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0,0));
        points.add(new Point(20,50));
        points.add(new Point(15,80));
        SvgScene picture = new SvgScene(500,500);
        Shape poli = new Polygon(points);
        Shape elli = new Ellipse(new Point(100,100),100,50);
        //Shape circ = new Circle(new Style("#FF8888","#000000",3),new Point(200,100),30);
        Shape coloredpoli = new SolidFillShapeDecorator(poli, "#0000FF");
        Shape coloredelli = new SolidFillShapeDecorator(elli, "#FF0000");
        Shape rotatedelli = new TransformationDecorator.Builder()
                .rotate(20, new Point(50,30)).
                translate(new Point(-10, 0)).
                scale(new Point(2, 1)).build(elli);
        Shape widthcoloredpoli = new StrokeShapeDecorator(coloredpoli, 2,"#FFFFFF");
        Shape widthcoloredelli = new StrokeShapeDecorator(coloredelli, 2,"#00F000");
        picture.getShapes().add(widthcoloredelli);
        picture.getShapes().add(widthcoloredpoli);
        //picture.getShapes().add(rotatedelli);
        //picture.getShapes().add(circ);
        try {
            FileWriter fw = new FileWriter("ksztalty.svg");
            fw.write(picture.toSvg());
            fw.close();
        }
        catch(IOException e) {
            System.out.println("Not svg");
        }
/*
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("ksztalty.svg");
        }
        catch(FileNotFoundException fe) {
            System.out.println("Pliku nie ma");
        }
        try {
            while ((ch = fr.read()) != -1)
                System.out.println((char)ch);
            fr.close();
        }
        catch(IOException e){
            System.out.println("Wystąpił błąd");
        }
*/
    }
}
