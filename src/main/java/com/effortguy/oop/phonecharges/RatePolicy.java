package com.effortguy.oop.phonecharges;

import com.effortguy.oop.theater2.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
