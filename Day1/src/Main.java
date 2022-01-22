import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PartOne partOne = new PartOne();
        PartTwo partTwo = new PartTwo();

        File file = new File("resources/day1input.txt");
        Scanner scanner = new Scanner(file);

        List<Integer> measurements = new ArrayList<>();

        while (scanner.hasNext()) {
            int measurement = scanner.nextInt();
            measurements.add(measurement);
        }

        Integer[] measurementListCopy = new Integer[measurements.size()];
        measurements.toArray(measurementListCopy);

        partOne.process(measurementListCopy);
        partTwo.process(measurementListCopy);
    }
}
