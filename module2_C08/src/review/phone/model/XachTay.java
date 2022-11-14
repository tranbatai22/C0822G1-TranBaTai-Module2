package review.phone.model;

public class XachTay extends Phone {
    private String nation;
    private String status;

    public XachTay(int id, String name, Double price, int amount, String producer, String nation, String status) {
        super(id, name, price, amount, producer);
        this.nation = nation;
        this.status = status;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return nation + '\'' + status + '\'' + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s, %s, %s, %s, %s, %s, %s", this.getId(), this.getName(), this.getPrice(), this.getAmount(),
                this.getProducer(), this.getNation(), this.getStatus());
    }
}
