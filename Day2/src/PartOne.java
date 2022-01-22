import java.util.List;

public class PartOne {

    public void process(List<String> input) {
        int horizontalPosition = 0;
        int depth = 0;

        for (String s : input) {
            horizontalPosition += move(s)[0];
            depth += move(s)[1];
        }
        System.out.println("If I multiply final horizontal position by final depth I get: " + horizontalPosition*depth);
    }

    public int[] move(String s) {
        String[] command = s.split(" ");
        String direction = command[0];
        int value = Integer.parseInt(command[1]);
        int[] moveValue = new int[2];
        switch (direction) {
            case "forward" :
                moveValue[0] = value;
                break;
            case "down" :
                moveValue[1] = value;
                break;
            case "up" :
                moveValue[1] = (-1)*value;
                break;
        }
        return moveValue;
    }
}
