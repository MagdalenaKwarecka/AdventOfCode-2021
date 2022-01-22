import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PartOne partOne = new PartOne();
        PartTwo partTwo = new PartTwo();

        File file = new File("resources/day2input.txt");
        Scanner scanner = new Scanner(file);

        List<String> plannedCourseInput = new ArrayList<>();

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            plannedCourseInput.add(input);
        }

        partOne.process(plannedCourseInput);
        partTwo.process(plannedCourseInput);
    }
}
