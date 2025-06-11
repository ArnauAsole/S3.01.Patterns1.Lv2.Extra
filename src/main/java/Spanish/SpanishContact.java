package Spanish;


import interfaces.Address;
import interfaces.ContactBook;
import interfaces.PhoneNumber;

public class SpanishContact implements ContactBook {
    public Address createAddress(String street, String city, String postalCode) {
        return new SpanishAddress(street, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhoneNumber(number);
    }
}