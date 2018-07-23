import Model.Employee;
import Model.Employee1;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class HBMain {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setName("hash");
        emp.setRole("CEO");
        emp.setInsertTime(new Date());


        //Get Session
        Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();

        //start transaction
        session.beginTransaction();

        //Save the Model object
        session.save(emp);

        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID="+emp.getId());

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionAnnotationFactory().close();
    }
}
