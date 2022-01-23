
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String pathname = "resources/day3input.txt";

        PartOne partOne = new PartOne();
        PartTwo partTwo = new PartTwo();

        List<String> measurements = MainOne.createInputDataList(pathname);

        partOne.process(measurements);
        partTwo.process(measurements);

    }
}
