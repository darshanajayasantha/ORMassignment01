package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        author.setaId("A01");
        author.setName("Enid");

        Book book = new Book();
        book.setbId("B01");
        book.setTitle("MadolDoowa");
        book.setPrice(650.00);
        book.setAuthor(author);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // Save
        session.persist(author);
        session.persist(book);

        //Search
        /*Author author1 = session.get(Author.class,"A02");
        System.out.println("Auther : " + author1.getaId());

        Book book1 = session.get(Book.class,"B02");
        System.out.println("Book : " + book1.getbId());*/

        //Update
        /*session.update(author);
        session.update(book);*/

        //Delete
        /*session.remove(author);
        session.remove(book);*/


        transaction.commit();
        session.close();

    }
}
