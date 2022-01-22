public class PartTwo {

    public void process(Integer[] measurementArray) {

        int count = threeMeasurementWindows(measurementArray);

        System.out.println("There are " + count + " sums that are larger than the previous sum.");
    }

    private int threeMeasurementWindows(Integer[] measurements) {
        int counter = 0;

        for (int i = 0; i < measurements.length - 3; i++) {
            if (threeElementsSum(measurements, i + 1) > (threeElementsSum(measurements, i)) ) {
                counter ++;
            }
        }

        return counter;
    }

    private int threeElementsSum(Integer[] array, int i) {
        return array[i] + array[i + 1] + array[i + 2];
    }

}
