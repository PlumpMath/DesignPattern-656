package com.rjzz.designpattern.Strategy;

/**
 * Created by RJzz on 2016/9/22.
 */

public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
