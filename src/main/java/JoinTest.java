import Model.Car;
import Model.Employee1;
import Model.Showroom;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class JoinTest {
    private static Showroom showroom = null;

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.setCarname("AUDI");
        c2.setCarname("TYTA");
        c3.setCarname("NISSN");

        List<Car> cars = new ArrayList<Car>();
        cars.add(c1);cars.add(c2);cars.add(c3);

        showroom = new Showroom();

        showroom.setSname("TESTSHHOWSROOM");
        showroom.setCars(cars);

        Session ses = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
        // Create a transaction and start it
        Transaction tx = ses.getTransaction();
        tx.begin();

        ses.save(showroom);

        // Do your database operations with the session
        // Once done, commit the transaction and session

        tx.commit();
        HibernateUtil.getSessionAnnotationFactory().close();

    }
}
