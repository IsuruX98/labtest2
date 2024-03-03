package Exercise02;

import java.time.LocalDate;
import java.time.Period;


public class PersonAdapter implements Student{

    private Person person;

    public PersonAdapter(Person person){
        this.person = person;
    }

    @Override
    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName() ;
    }

    @Override
    public int getAge() {
        LocalDate dateOfBirth = person.getDateOfBirth();
        LocalDate today = LocalDate.now();

        Period period = Period.between(dateOfBirth, today);

        // Extract the years, months, and days from the period
        int years = period.getYears();

        return years;
    }

    @Override
    public String getContactNumber() {
        return person.getPhoneNumber();
    }
}
