package org.example;

import org.hibernate.Session;

import java.util.Scanner;

public class Main_SelectByID {

    public static void main() {

        System.out.println("Podaj ID pojazdu, który chcesz wyświtlić:");

        Scanner scanner = new Scanner(System.in);
        long id= scanner.nextLong();

        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){
            Pojazd pojazd = session.get(Pojazd.class, id);

            System.out.println("Znaleziono pojazd: " + pojazd);


        } catch (Exception ioe){
            System.err.println("Błąd: "+ ioe);
        }
    }
}
