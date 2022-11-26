package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Main_Update {

    public static void main() {

        System.out.println("Podaj ID pojazdu, który chcesz zaaktualizować:");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();


        try(Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){

            Transaction transaction = session.beginTransaction();

            System.out.println("Podaj markę:");
            String cos1 = scanner.nextLine();
            String marka = scanner.nextLine();

            System.out.println("Podaj moc:");
            double moc = scanner.nextDouble();

            System.out.println("Podaj kolor:");
            String cos2 = scanner.nextLine();
            String kolor = scanner.nextLine();

            System.out.println("Podaj rok produkcji:");
            int rokProdukcji = scanner.nextInt();

            System.out.println("Napisz, czy pojazd jest elektryczny (true/false):");
            boolean czyElektryczny = scanner.nextBoolean();

            Pojazd pojazd = Pojazd.builder()
                    .marka(marka)
                    .moc(moc)
                    .kolor(kolor)
                    .rokProdukcji(rokProdukcji)
                    .czyElektryczny(czyElektryczny)
                    .id(id)
                    .build();

                    session.merge(pojazd);

            transaction.commit();

        } catch (Exception ioe){

        }
    }
}
