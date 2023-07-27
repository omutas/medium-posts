package org.mugurtas.medium.access_modifier.averagecalculator;

//import org.mugurtas.medium.access_modifier.calculator.BasicCalculator;

public class AverageCalculator {
    public int calculateAverage(int a, int b){
        /**
         * compiler gives warning when we uncommented lines below and above
         * because BasicCalculator has default modifier, and put in a different package
         */
        /*BasicCalculator basicCalculator = new BasicCalculator();
        return basicCalculator.add(a,b)/2;*/
        return 0;
    }
}
