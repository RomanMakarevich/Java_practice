package java_practic.lectures.lecture_22.task_2;

import java.util.Objects;

public class Phone {
    private String model;
    private String producer;
    private int price;

    public Phone(String model, String producer, int price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return getPrice() == phone.getPrice() &&
                Objects.equals(getModel(), phone.getModel()) &&
                Objects.equals(getProducer(), phone.getProducer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getProducer(), getPrice());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("model='").append(model).append('\'');
        sb.append(", producer='").append(producer).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
