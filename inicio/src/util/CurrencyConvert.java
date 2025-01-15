package util;

public class CurrencyConvert {
    public static  double convert(double currencyValue, double value) {
        double sum, porcent;

        porcent = (currencyValue * value) * 0.06;
        sum = (currencyValue * value) + porcent;

       return sum;
    }
}
