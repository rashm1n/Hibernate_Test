package Model;

import javax.persistence.*;

@Entity
@Table(name = "CHILDREN")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "child_ID")
    private int cid;

    @Column(name = "NAME",nullable = false,unique = false)
    private String name;
}
