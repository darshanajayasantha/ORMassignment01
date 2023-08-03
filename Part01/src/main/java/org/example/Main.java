package org.example;

import org.example.entity.Book;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setbId("B03");
        book.setTitle("Kumarodaya");
        book.setPrice(350.00);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // Save
        session.persist(book);

        //Retrieve a book by its Id
        /*Book book1 = session.get(Book.class,"B02");
        System.out.println(book1.getbId());*/

        //Update
        //session.update(book);

        // Delete
        //session.remove(book);


        transaction.commit();
        session.close();
    }
}
