public class PartOne {

    public void process(Integer[] measurementArray) {
        int counter = 0;
        for (int i = 0; i < measurementArray.length - 1; i++) {
            if (measurementArray[i + 1] > measurementArray[i])
                counter ++;
        }
        System.out.println("The number of times a depth measurement increases: " + counter);
    }
}
