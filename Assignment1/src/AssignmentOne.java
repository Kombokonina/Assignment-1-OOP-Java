import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\mrjom\\IdeaProjects\\Assignment1\\src\\file1.txt");
        Shape shape = new Shape();

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] arr = line.split(", ");
            Point point = new Point(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            shape.addPoint(point);
        }
    }
}