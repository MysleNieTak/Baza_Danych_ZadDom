package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main_Update {

    public static void main(String[] args) {
        try(Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){

            Transaction transaction = session.beginTransaction();

            Pojazd pojazd = Pojazd.builder()
                    .moc(95)
                    .marka("Mustang")
                    .kolor("Czarny")
                    .czyElektryczny(true)
                    .build();

                    session.merge(pojazd);

            transaction.commit();

        } catch (Exception ioe){

        }
    }
}
