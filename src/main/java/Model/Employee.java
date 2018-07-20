
//https://www.journaldev.com/2882/hibernate-tutorial-for-beginners
//https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
//http://hibernate.org/orm/
//http://index-of.es/Java/Harnessing%20Hibernate%202008.pdf

package Model;

import java.util.Date;

public class Employee {

    private int id;
    private String name;
    private String role;
    private Date insertTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Date getInsertTime() {
        return insertTime;
    }
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

}
