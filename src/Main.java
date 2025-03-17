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
        Polygon poli = new Polygon(points, new Style("#FA8072","0004FF",2));
        try {
            FileWriter fw = new FileWriter("ksztalty.svg");
            fw.write(poli.toSvg());
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
