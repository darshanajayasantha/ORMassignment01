package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setbId("B03");
        book.setTitle("Sara");
        book.setPrice(700.00);

        Book book1 = new Book();
        book1.setbId("B04");
        book1.setTitle("The School");
        book1.setPrice(450.00);

        Author author = new Author();
        author.setaId("A02");
        author.setName("Blyton");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);

        author.setBookList(bookList);
        book.setAuthor(author);
        book1.setAuthor(author);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //Save
        session.persist(book);
        session.persist(book1);
        session.persist(author);

        //Search
        /*Author author2= session.get(Author.class,"A01");
        System.out.println("Auther : " + author2.getaId());

        Book book2 = session.get(Book.class,"B01");
        System.out.println("Book : " + book2.getbId());

        Book book3 = session.get(Book.class,"B02");
        System.out.println("Book : " + book3.getbId());*/

        //Update
        /*session.update(author);
        session.update(book);
        session.update(book1);*/

        //Delete
        /*session.remove(book);
        session.remove(book1);
        session.remove(author);*/


        transaction.commit();
        session.close();
    }
}
