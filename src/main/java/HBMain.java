import Model.Employee;
import Model.Employee1;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class HBMain {
    public static void main(String[] args) {
        Employee1 empp = new Employee1();
        empp.setName("hasxxxxxxxdsdhgsdg");
        empp.setRole("CEOdsss");
        empp.setInsertTime(new Date());
        Employee1 eee = null;
        Employee1 ee = null;


        Session ses = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
            // Create a transaction and start it
        Transaction tx = ses.getTransaction();
        tx.begin();
      ses.save(empp);

        eee = (Employee1)ses.get(Employee1.class,20);
        ee = (Employee1)ses.load(Employee1.class,28);
        System.out.println(ee.getName());
            // Do your database operations with the session
            // Once done, commit the transaction and session
        tx.commit();
        HibernateUtil.getSessionAnnotationFactory().close();
        System.out.println(ee.getName());
    }
}
