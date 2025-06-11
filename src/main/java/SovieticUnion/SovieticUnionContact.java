package SovieticUnion;

import interfaces.Address;
import interfaces.ContactBook;
import interfaces.PhoneNumber;

public class SovieticUnionContact implements ContactBook {
    public Address createAddress(String street, String city, String postalCode) {
        return new SovieticUnionAddress(street, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String number) {
        return new SovieticUnionPhoneNumber(number);
    }
}