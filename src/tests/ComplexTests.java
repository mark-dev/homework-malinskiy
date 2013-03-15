package tests;

import analyze.impl.AnalysisInversionMethod;
import analyze.impl.AnalysisSeriesMethod;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 15.03.13
 * Time: 19:09
 * To change this template use File | Settings | File Templates.
 */
public class ComplexTests {
    @Test
    public void testCalcEstimate() throws Exception {
        double[] exampleArray = new double[]{5.5,5.1,5.7,5.2,4.8,
                5.7,5.0,6.5,5.4,5.8,
                6.8,6.6,4.9,5.4,5.9,
                5.4,6.8,5.8,6.9,5.5};
        double[] exampleArray2 = new double[]{5,3,8,9,4,1,7,5};
        Assert.assertEquals(new AnalysisSeriesMethod().calcEstimate(exampleArray),13);
        Assert.assertEquals(new AnalysisInversionMethod().calcEstimate(exampleArray),62);

    }
}
