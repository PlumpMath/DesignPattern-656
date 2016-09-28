package com.rjzz.designpattern.Strategy;

/**
 * Created by RJzz on 2016/9/22.
 */

public class CashContext {
    private CashSuper cashSuper;
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300减100":
                CashRertun cashRertun = new CashRertun("300", "100");
                cashSuper = cashRertun;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cashSuper = cashRebate;
                break;
            default:
                break;
        }
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
