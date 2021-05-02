package com.effortguy.oop.phonecharges;

import com.effortguy.oop.theater2.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;
    
    public AdditionalRatePolicy(RatePolicy ratePolicy) {
        this.next = ratePolicy;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }

    protected abstract Money afterCalculated(Money fee);
}
