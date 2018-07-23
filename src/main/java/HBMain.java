import Model.Employee;
import Model.Employee1;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class HBMain {
    public static void main(String[] args) {
        Employee1 empp = new Employee1();
        empp.setName("hasdsdhgsdg");
        empp.setRole("CEOdsss");
        empp.setInsertTime(new Date());
        Employee1 eee = null;


        Session ses = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
            // Create a transaction and start it
        Transaction tx = ses.getTransaction();
        tx.begin();
//        ses.save(empp);
         eee = (Employee1)ses.get(Employee1.class,20);
            // Do your database operations with the session
            // Once done, commit the transaction and session
        tx.commit();
        HibernateUtil.getSessionAnnotationFactory().close();
        System.out.println(eee.getName());
    }
}
