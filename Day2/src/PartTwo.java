import java.util.List;

public class PartTwo {

    PartOne partOne = new PartOne();

    public void process(List<String> input) {
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;

        for (String s : input) {
            aim += partOne.move(s)[1];
            horizontalPosition += partOne.move(s)[0];
            depth += aim * partOne.move(s)[0];
        }
        System.out.println("If I multiply final horizontal position by final depth using new interpretation I get: " + horizontalPosition * depth);
    }
}
