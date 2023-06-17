import models.address.Address;
import models.candidate.Candidate;
import models.career.Career;
import models.contact.Contact;
import models.person.Gender;
import models.person.Person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Candidate candidate = candidateFactory(
                new Person(
                        "Gustavo",
                        "111.222.333-44",
                        LocalDate.of(2003, 11, 12),
                        Gender.MASCULINE),
                new Address("Rua 7",
                        "7",
                        "casa 7",
                        "sete",
                        "SP",
                        "SP"),
                new Contact(
                        "gustavo@gmail.com",
                        "1140028922",
                        "11940028922"),
                new Career(
                        "Dev",
                        Arrays.asList("SA", "SB"),
                        BigDecimal.valueOf(60000.00),
                        "Dev",
                        Arrays.asList("Java", "SQL")),
                BigDecimal.valueOf(60),
                BigDecimal.valueOf(10)
        );

        new FileOutput().toFile(
                "C:\\mjv\\MJV_Java_School\\Sis_people_job_Atividade2\\arquivo.csv",
                new ArrayList<>() {{
                    add(candidate);
                }},
                new StringBuilder()
        );

    }

    public static Candidate candidateFactory(Person person, Address address, Contact contact,
                                             Career career, BigDecimal wageExpectationMax,
                                             BigDecimal wageExpectationMin) {
        return Candidate.build()
                .setPerson(person)
                .setAddress(address)
                .setContact(contact)
                .setExperience(career)
                .setWageExpectationMax(wageExpectationMax)
                .setWageExpectationMin(wageExpectationMin)
                .builder();
    }

}