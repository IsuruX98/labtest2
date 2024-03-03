package Exercise04;

// Engineer.java
class Engineer extends Employee {
    Engineer() {
        description = "Engineer";
    }

    @Override
    double getSalary() {
        return 60000.0;
    }
}

