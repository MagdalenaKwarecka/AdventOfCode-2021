import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainOne {
    public static void main(String[] args) throws FileNotFoundException {
        PartOne partOne = new PartOne();
        PartTwo partTwo = new PartTwo();

        String pathname = "resources/day1input.txt";
        List<Integer> measurements = createInputDataList(pathname).stream().map(Integer::parseInt).collect(Collectors.toList());

        Integer[] measurementListCopy = new Integer[measurements.size()];
        measurements.toArray(measurementListCopy);

        partOne.process(measurementListCopy);
        partTwo.process(measurementListCopy);
    }

    public static List<String> createInputDataList(String pathname) throws FileNotFoundException {

        File file = new File(pathname);
        Scanner scanner = new Scanner(file);

        List<String> inputData = new ArrayList<>();

        while (scanner.hasNext()) {
            String measurement = scanner.nextLine();
            inputData.add(measurement);
        }

        return inputData;
    }
}
