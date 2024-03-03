package Exercise04;

// Consultant.java
class Consultant extends Employee {
    Consultant() {
        description = "Consultant";
    }

    @Override
    double getSalary() {
        return 70000.0;
    }
}
