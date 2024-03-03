package Exercise02;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("Yasiru");
        person.setLastName("Karunarathne");
        person.setNic("1998135035837");
        LocalDate dob = LocalDate.of(1998, 02,01);
        person.setDateOfBirth(dob);
        person.setPhoneNumber("0788034559");

        PersonAdapter personAdapter = new PersonAdapter(person);

        System.out.println("Full Name: " + personAdapter.getFullName());
        System.out.println("Age: " + personAdapter.getAge());
        System.out.println("Contact Number: " + personAdapter.getContactNumber());

    }
}