package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Main_Create_Insert {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

      try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){
        Transaction transaction = session.beginTransaction();

          System.out.println("Podaj markę:");
          String marka = scanner.nextLine();

          System.out.println("Podaj moc:");
          double moc = scanner.nextDouble();

          System.out.println("Podaj kolor:");
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
                  .build();

        session.persist(pojazd);

        //    private String marka;
        //    private double moc;
        //    private String kolor;
        //    private int rokProdukcji;
        //    private boolean czyElektryczny;
        transaction.commit();

    } catch (Exception ioe){

    }
}
}