import java.util.ArrayList;
import java.util.List;

public class PartTwo {
    public void process(List<String> input) {
        int oxygenGeneratorRating = findOxyGenRate(input);
        int co2ScrubberRating = findCo2ScrubRate(input);

        System.out.println("The life support rating of the submarine is " + co2ScrubberRating * oxygenGeneratorRating);
    }

    private int findOxyGenRate(List<String> input) {
        int countZero = 0;
        int countOne = 0;
        int i = 0;
        List<String> binary = new ArrayList<>(List.copyOf(input));
        while (input.size() > 1) {
            for (String s : input) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else if (s.charAt(i) == '1') {
                    countOne++;
                }
            }
            char charAtIndex = (Math.max(countOne, countZero) == countOne) ? '1' : '0';
            for (String s : input) {
                if (!(s.charAt(i) == charAtIndex)) {
                    binary.remove(s);
                }
            }
            input = new ArrayList<>(List.copyOf(binary));
            countZero = 0;
            countOne = 0;
            i++;
        }
        return Integer.parseInt(input.get(0), 2);
    }

    private int findCo2ScrubRate(List<String> input) {
        int countZero = 0;
        int countOne = 0;
        List<String> binary = new ArrayList<>(List.copyOf(input));
        int i = 0;
        while (input.size() > 1) {
            for (String s : input) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else if (s.charAt(i) == '1') {
                    countOne++;
                }
            }
            char charAtIndex = (Math.max(countOne, countZero) == countOne) ? '0' : '1';
            for (String s : input) {
                if (!(s.charAt(i) == charAtIndex)) {
                    binary.remove(s);
                }
            }
            input = new ArrayList<>(List.copyOf(binary));
            countZero = 0;
            countOne = 0;
            i++;
        }
        return Integer.parseInt(input.get(0), 2);
    }
}
