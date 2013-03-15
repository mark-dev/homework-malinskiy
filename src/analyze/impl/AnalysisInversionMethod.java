package analyze.impl;

import interfaces.IAnalysisDependenceMethod;


/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 15.03.13
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class AnalysisInversionMethod implements IAnalysisDependenceMethod {
    @Override
    public int calcEstimate(double[] array) {
        int[] inversionArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            //создаем массив инверсий для каждого элемента исходного массива
            inversionArray[i] = getInversionByIndex(i, array);
        }
        return sum(inversionArray);
    }

    //Сумирует массив целых чисел
    private int sum(int[] inversions) {
        int res = 0;
        for (int i = 0; i < inversions.length; i++) {
            res = res + inversions[i];
        }
        return res;
    }

    /*Возвращает количество чисел, больших числа с индексом index
     в массиве  data, индекс которых больше индекса данного числа
     */
    private int getInversionByIndex(int index, double[] data) {
        int inversion = 0;
        double reqElem = data[index];
        for (int i = index; i < data.length; i++) {
            if (data[i] < reqElem) {
                inversion++;
            }
        }
        return inversion;
    }
}
