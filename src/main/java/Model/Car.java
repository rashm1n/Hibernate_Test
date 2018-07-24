package Model;

import javax.persistence.*;

@Entity
@Table(name = "CARS")
public class Car {

    @Id
    @Column(name = "CARID",unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carid = 0;

    @Column(name = "CARNAME",nullable = false)
    private String carname = null;

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }
}
