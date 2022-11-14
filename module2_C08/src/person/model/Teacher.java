package person.model;

public class Teacher extends Person {
    private double luong;

    public Teacher(int id, String ten, String sdt, String email, double luong) {
        super(id, ten, sdt, email);
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "luong=" + luong +
                '}'+ super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s, %s, %s, %s, %s\n", this.getId(), this.getTen(), this.getSdt(), this.getEmail(), this.getLuong());
    }
}
