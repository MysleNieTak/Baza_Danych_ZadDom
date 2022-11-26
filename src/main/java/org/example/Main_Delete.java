package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main_Delete {

    public static void main(String[] args) {
        try(Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){

            Transaction transaction = session.beginTransaction();

            Pojazd pojazd = session.get(Pojazd.class, 2L);

            if(pojazd != null){
                session.remove(pojazd);
            }

            transaction.commit();

        } catch (Exception ioe){

        }
    }
}
