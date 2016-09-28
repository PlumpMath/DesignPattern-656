package com.rjzz.designpattern.Strategy;

/**
 * Created by RJzz on 2016/9/22.
 */

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
