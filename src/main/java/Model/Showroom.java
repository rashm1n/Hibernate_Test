package Model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SHOWROOMS")
public class Showroom {

    @Id
    @Column(name = "Showroom_ID",unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid = 0;

    @Column(name = "SHOWROOM_NAME",nullable = false)
    private String sname = null;

    @OneToMany
    @JoinColumn(name = "Showroom_ID")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Car> cars = null;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
