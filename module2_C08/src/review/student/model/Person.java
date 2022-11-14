package review.student.model;

public abstract class Person {
    private String name;
    private String date;
    private String sex;
    private String address;

    public Person(String name, String date, String sex, String address) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}'+"\n";
    }
    public abstract String getInfo();
}
