package org.example;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();

            System.out.println("Żeby dodać samochód, wpisz: DODAJ. \n" +
                    "Żeby wyświetlić listę dostępnych samochodów, wpisz: WYŚWIETL. \n"+
                    "Żeby wyszukać samochód po ID, wpisz: SZUKAJ. \n" +
                    "Żeby usunąć samochód, wpisz: USUŃ.\n"+
                    "Żeby zaaktualizować pojazd, wpisz: ZAAKTUALIZUJ.");

        String odpowiedz = scanner.nextLine();

        if(odpowiedz.equals("dodaj")) {

//    private String marka;
//    private double moc;
//    private String kolor;
//    private int rokProdukcji;
//    private boolean czyElektryczny;

          Main_Create_Insert.main();

        } else if (odpowiedz.equals("wyświetl")) {

            Main_Read_SelectList.main();

        } else if (odpowiedz.equals("szukaj")) {

            Main_SelectByID.main();

        } else if (odpowiedz.equals("usuń")) {

            Main_Delete.main();

        } else if (odpowiedz.equals("zaaktualizuj")) {

            Main_Update.main();

        } else {
            System.out.println("Niepoprawna odpowiedź.");
        }
    }
}
}