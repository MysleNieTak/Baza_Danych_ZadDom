package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;

public class Main_Create_Insert {
    public static void main(String[] args) {



      try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){
        Transaction transaction = session.beginTransaction();

        Pojazd pojazd = Pojazd.builder()
                .marka("Maluch 125p")
                .moc(25)
                .kolor("Biały")
                .rokProdukcji(2015)
                .czyElektryczny(false)
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