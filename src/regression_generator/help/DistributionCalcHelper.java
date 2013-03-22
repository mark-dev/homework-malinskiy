package regression_generator.help;

/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 15.03.13
 * Time: 19:43
 * To change this template use File | Settings | File Templates.
 */
public class DistributionCalcHelper {
    public static double calcMx(double[] array) {
        double m = 0;
        for (int i = 0; i < array.length; i++) {
            m = m + array[i];
        }
        return m / array.length;
    }

    public static double calcSigma(double[] array) {
        double mx = calcMx(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + Math.pow((array[i] - mx), 2);
        }
        return sum / array.length;
    }
    public static int[] calcHistogram(double[] array, int parts) {
        double min = min(array);
        double max = max(array);
        double step = (max - min) / parts;
        System.out.println("min: " + min(array));
        System.out.println("max: " + max(array));
        System.out.println("step: "+step);
        int[] histValues = new int[parts];
        for (int i = 0; i < histValues.length; i++) {
            int count = 0;   //Колво попаданий в текущий промежуток
            double right = min + step*(i+1);
            double left = min + step*(i);
            for (int j = 0; j < array.length; j++) {
                if(right>array[j] && array[j]>left){
                    count++;
                }
                else if(i == 0 && array[j] == min){
                    count++;
                }
                else if(i == histValues.length -1 && array[j] == max){
                    count++;
                }
            }
            histValues[i] = count;
        }
        return histValues;
    }
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
