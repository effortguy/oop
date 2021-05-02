package com.effortguy.oop.phonecharges;

import com.effortguy.oop.theater2.Money;

import java.time.Duration;

public class FixedPolicy extends BasicRatePolicy {
    private Money amount;
    private Duration seconds;

    public FixedPolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
