package person.model;

public class Student extends Person {
    private double diem;

    public Student(int id, String ten, String sdt, String email, double diem) {
        super(id, ten, sdt, email);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "diem=" + diem +
                '}' + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s, %s, %s, %s, %s\n", this.getId(), this.getTen(), this.getSdt(), this.getEmail(), this.getDiem());
    }
}
