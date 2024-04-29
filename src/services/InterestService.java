package services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int month) {
        if (month < 1) {
            throw new InvalidParameterException("Month must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, month);
    }
}
