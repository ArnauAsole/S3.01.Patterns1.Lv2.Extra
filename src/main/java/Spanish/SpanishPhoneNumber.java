package Spanish;

import interfaces.PhoneNumber;

public class SpanishPhoneNumber implements PhoneNumber {
    private final String number;

    public SpanishPhoneNumber(String number) {
        this.number = number;
    }

    public String getInternationalNumber() {
        return "+34 " + number;
    }
}