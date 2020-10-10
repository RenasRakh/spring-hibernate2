package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car1")
public class Car {

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
   // @Column(name = "user")
    private User user;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "model=" + model + ", series=" + series;
    }
}
