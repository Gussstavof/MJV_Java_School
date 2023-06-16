package models.candidate;

import models.address.Address;
import models.career.Career;
import models.contact.Contact;
import models.person.Person;

import java.math.BigDecimal;

public class Candidate {
    private Person person;
    private Career experience;
    private Contact contact;
    private Address address;
    private BigDecimal wageExpectationMax;
    private BigDecimal wageExpectationMin;

    private Candidate(Person person, Career experience, Contact contact, Address address,
                     BigDecimal wageExpectationMax, BigDecimal wageExpectationMin) {
        this.person = person;
        this.experience = experience;
        this.contact = contact;
        this.address = address;
        this.wageExpectationMax = wageExpectationMax;
        this.wageExpectationMin = wageExpectationMin;
    }

    private Candidate(){};

    public Candidate setPerson(Person person) {
        this.person = person;
        return this;
    }

    public Candidate setExperience(Career experience) {
        this.experience = experience;
        return this;
    }

    public Candidate setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public Candidate setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Candidate setWageExpectationMax(BigDecimal wageExpectationMax) {
        this.wageExpectationMax = wageExpectationMax;
        return this;
    }

    public Candidate setWageExpectationMin(BigDecimal wageExpectationMin) {
        this.wageExpectationMin = wageExpectationMin;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public Career getExperience() {
        return experience;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    public BigDecimal getWageExpectationMax() {
        return wageExpectationMax;
    }

    public BigDecimal getWageExpectationMin() {
        return wageExpectationMin;
    }

    public static Candidate build(){
        return new Candidate();
    }

    public Candidate builder(){
        return new Candidate(person, experience, contact, address, wageExpectationMax, wageExpectationMin);
    }
}
