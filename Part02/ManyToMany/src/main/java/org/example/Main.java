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
        Author author = new Author();
        author.setaId("A03");
        author.setName("Mendis");

        Author author1 = new Author();
        author1.setaId("A04");
        author1.setName("Sibil");

        Book book = new Book();
        book.setbId("B03");
        book.setTitle("Sherlock Holmes");
        book.setPrice(450.00);

        Book book1 = new Book();
        book1.setbId("B04");
        book1.setTitle("Holman walawwa");
        book1.setPrice(350.00);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author);
        authorList.add(author1);

        List<Book>bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);

        author.setBooks(bookList);
        author1.setBooks(bookList);
        book.setAuthorList(authorList);
        book.setAuthorList(authorList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //Save
        session.persist(author);
        session.persist(author1);
        session.persist(book);
        session.persist(book1);

        //Search
       /* Author author2= session.get(Author.class,"A01");
        System.out.println("Auther : " + author2.getaId());

        Author author3= session.get(Author.class,"A02");
        System.out.println("Auther : " + author3.getaId());

        Book book2 = session.get(Book.class,"B01");
        System.out.println("Book : " + book2.getbId());

        Book book3 = session.get(Book.class,"B02");
        System.out.println("Book : " + book3.getbId());*/

        //Update
        /*session.update(author);
        session.update(author1);
        session.update(book);
        session.update(book1);*/

        //Delete
        /*session.remove(author);
        session.remove(author1);
        session.remove(book);
        session.remove(book1);*/

        transaction.commit();
        session.close();

    }
}
