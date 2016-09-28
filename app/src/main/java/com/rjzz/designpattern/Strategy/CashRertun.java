package com.rjzz.designpattern.Strategy;

/**
 * Created by RJzz on 2016/9/22.
 */

public class CashRertun extends CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    public CashRertun(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }


    @Override
    public double acceptCash(double money) {
        double result = money;
        if (result > moneyCondition) {
            result -= Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
