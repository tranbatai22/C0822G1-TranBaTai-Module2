package review.student.model;

public class Student extends Person {

    public Student(String name, String date, String sex, String address) {
        super(name, date, sex, address);
    }

    @Override
    public String getInfo() {
        return String.format("%s, %s, %s, %s\n", this.getName(), this.getDate(), this.getSex(), this.getAddress());
    }
}
