package com.effortguy.oop.phonecharges;

import com.effortguy.oop.theater2.Money;

public class TaxablePolicy extends AdditionalRatePolicy {
    private double taxRatio;

    public TaxablePolicy(double taxRatio, RatePolicy ratePolicy) {
        super(ratePolicy);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
