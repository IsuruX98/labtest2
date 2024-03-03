package Exercise04;

// Manager.java
class Manager extends Employee {
    Manager() {
        description = "Manager";
    }

    @Override
    double getSalary() {
        return 80000.0;
    }
}

