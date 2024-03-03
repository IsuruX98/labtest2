public class UniversityStudent implements Student{

    private String fullName;
    private int age;
    private String contactNumber;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getContactNumber() {
        return contactNumber;
    }
}
