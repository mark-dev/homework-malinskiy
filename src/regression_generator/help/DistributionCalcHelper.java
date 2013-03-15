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
}
