package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Main_Delete {

    public static void main() {

        System.out.println("Podaj ID pojazdu, który chcesz usunąć: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        try(Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){

            Transaction transaction = session.beginTransaction();

            Pojazd pojazd = session.get(Pojazd.class, id);

            if(pojazd != null){
                session.remove(pojazd);
            }

            transaction.commit();

        } catch (Exception ioe){

        }
    }
}
