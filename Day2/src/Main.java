import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String pathname = "resources/day2input.txt";

        PartOne partOne = new PartOne();
        PartTwo partTwo = new PartTwo();

        List<String> plannedCourseInput = MainOne.createInputDataList(pathname);

        partOne.process(plannedCourseInput);
        partTwo.process(plannedCourseInput);
    }
}
