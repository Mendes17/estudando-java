package services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate(); // cria um contrato

    default double payment(double amount, int months) { // define como padrão o método (payment) não precisando ser reescrito
        if (months < 1 || months > 12) {
            throw new InvalidParameterException("Months must be between 1 and 12");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, months);
    }
}
