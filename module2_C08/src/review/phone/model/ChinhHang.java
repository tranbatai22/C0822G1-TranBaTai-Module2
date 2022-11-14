package review.phone.model;

public class ChinhHang extends Phone {
    private double time;
    private String range;

    public ChinhHang(int id, String name, Double price, int amount, String producer, double time, String range) {
        super(id, name, price, amount, producer);
        this.time = time;
        this.range = range;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return time + '\'' + range + '\'' + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s, %s, %s, %s, %s, %s, %s", this.getId(), this.getName(), this.getPrice(), this.getAmount(),
                this.getProducer(), this.getTime(), this.getRange());
    }
}
