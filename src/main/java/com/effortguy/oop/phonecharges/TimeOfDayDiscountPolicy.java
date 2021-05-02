package com.effortguy.oop.phonecharges;

import com.effortguy.oop.theater2.Money;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

public class TimeOfDayDiscountPolicy extends  BasicRatePolicy {
    private List<LocalTime> starts;
    private List<LocalTime> ends;
    private List<Duration> durations;
    private List<Money> amounts;

    @Override
    protected Money calculateCallFee(Call call) {
        Money result = Money.ZERO;

        for(DateTimeInterval interval : call.splitByDay()) {
            for(int i=0; i < starts.size(); i++) {
                result.plus(amounts.get(i).times(
                        Duration.between(from(interval, starts.get(i)), to(interval, ends.get(i)))
                        .getSeconds() / durations.get(i).getSeconds()));
            }
        }

        return result;
    }

    private LocalTime from(DateTimeInterval interval, LocalTime from) {
        return interval.getFrom().toLocalTime().isBefore(from) ? from : interval.getFrom().toLocalTime();
    }

    private LocalTime to(DateTimeInterval interval, LocalTime to) {
        return interval.getTo().toLocalTime().isAfter(to) ? to : interval.getTo().toLocalTime();
    }
}
