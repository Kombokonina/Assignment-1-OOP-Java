import java.util.ArrayList;

public class Shape {
    public ArrayList <Point> points = new ArrayList<>();

    public void addPoint(Point p){
        points.add(p);
    }

    public ArrayList<Point> getPoints(){
        return points;
    }

    public double calculatePerimeter(){
        double Perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            int j = i + 1;
            if (j == points.size()) {
                j = 0;
            }
            Perimeter += points.get(i).distance(points.get(j));
        }
        return Perimeter;
    }
    public double longestSide(){
        double max=Double.MIN_VALUE;
        for( int i=0; i<points.size();i++){
            int j=i+1;
            if (j == points.size()) {
                j=0;
            }
            if(points.get(i).distance(points.get(j))>max){
                max=(points.get(i).distance(points.get(j)));
            }
        }
        return max;
    }
    public double averageLength(){
        return calculatePerimeter()/points.size();
    }
}