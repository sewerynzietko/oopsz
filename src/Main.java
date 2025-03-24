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
        Shape poli = new Polygon(points, new Style("#FF0000","0004FF",2));
        Shape elli = new Ellipse(new Style("#888888","000000",3),new Point(100,100),100,50);
        Shape circ = new Circle(new Style("#FF8888","000000",3),new Point(100,100),100);
        try {
            FileWriter fw = new FileWriter("ksztalty.svg");
            fw.write(circ.toSvg());
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
