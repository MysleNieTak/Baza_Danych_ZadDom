package org.example;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;

import java.util.List;

public class Main_Read_SelectList {
    public static void main(String[] args) {

        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){
            TypedQuery<Pojazd> zapytanie = session.createQuery("FROM Pojazd", Pojazd.class);

            List<Pojazd> ListaWszystkichPojazdów = zapytanie.getResultList();

            for(Pojazd pojazd : ListaWszystkichPojazdów){
                System.out.println(pojazd);
            }


        } catch (Exception ioe){
            System.out.println("Błąd: "+ ioe);
        }



    }

}
