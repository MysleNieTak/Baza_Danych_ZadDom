package org.example;

import org.hibernate.Session;

public class Main_SelectByID {

    public static void main(String[] args) {
        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){
            Pojazd pojazd = session.get(Pojazd.class, 2L);

            System.out.println("Znaleziono pojazd: " + pojazd);


        } catch (Exception ioe){
            System.err.println("Błąd: "+ ioe);
        }
    }
}
