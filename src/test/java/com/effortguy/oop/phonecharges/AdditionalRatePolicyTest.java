package com.effortguy.oop.phonecharges;

import com.effortguy.oop.theater2.Money;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AdditionalRatePolicyTest {

    @Test
    void 객체생성() {
        Phone phone = new Phone(
                    new TaxablePolicy(0.05,
                            new RateDiscountablePolicy(Money.wons(1000),
                                    new NightlyDiscountPolicy(Money.wons(70), Money.wons(100), Duration.ofSeconds(10))))
        );
    }
}