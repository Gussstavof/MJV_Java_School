package models.person;

import java.time.LocalDate;

public class Person {

    private String name;
    private String cpf;
    private LocalDate birthdate;
    private Gender gender;

    public Person(String name, String cpf, LocalDate birthdate, Gender gender) {
        this.name = name;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Gender getGender() {
        return gender;
    }
}
