import java.util.List;

public class PartOne {

    public void process(List<String> input) {
        int gammaRate = findGamma(input);
        int epsilonRate = findEpsilonRate(input);
        System.out.println("The power consumption of the submarine equals: " + gammaRate * epsilonRate);
    }

    private int findGamma(List<String> input) {
        int length = input.get(0).length();
        int countZero = 0;
        int countOne = 0;
        String binary = "";
        for (int i = 0; i < length; i++) {
            for (String s : input) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else if (s.charAt(i) == '1') {
                    countOne++;
                }
            }
            binary = (countOne > countZero) ? binary.concat("1") : binary.concat("0");
            countZero = 0;
            countOne = 0;
        }
        return Integer.parseInt(binary, 2);
    }

    private int findEpsilonRate(List<String> input) {
        int length = input.get(0).length();
        int countZero = 0;
        int countOne = 0;
        String binary = "";
        for (int i = 0; i < length; i++) {
            for (String s : input) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else if (s.charAt(i) == '1') {
                    countOne++;
                }
            }
            binary = (countOne < countZero) ? binary.concat("1") : binary.concat("0");
            countZero = 0;
            countOne = 0;
        }
        return Integer.parseInt(binary, 2);
    }
}
