package main;

import interfaces.ContactBook;
import interfaces.Address;
import interfaces.PhoneNumber;
import manager.ContactManager;
import Spanish.SpanishContact;
import SovieticUnion.SovieticUnionContact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactBook contactFactory;

        System.out.println("Choose country (spanish/soviet):");
        String country = sc.nextLine().toLowerCase();

        switch (country) {
            case "spanish":
                contactFactory = new SpanishContact();
                break;
            case "soviet":
                contactFactory = new SovieticUnionContact();
                break;
            default:
                System.out.println("Unsupported country.");
                return;
        }

        System.out.print("Street: ");
        String street = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("Postal Code: ");
        String postalCode = sc.nextLine();
        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        Address address = contactFactory.createAddress(street, city, postalCode);
        PhoneNumber phoneNumber = contactFactory.createPhoneNumber(phone);

        ContactManager manager = new ContactManager(address, phoneNumber);
        System.out.println("\nSaved contact:");
        manager.showContact();
    }
}
