package com.test;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.entity.Author;
import com.entity.Book;

public class Test {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("com/resource/hib.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		
		 Book newBook = new Book();
	     newBook.setTitle("Hibernate Made Easy");
	     newBook.setDescription("Simplified Data Persistence with Hibernate and JPA");
	     newBook.setPublishedDate(new Date());
	     newBook.setAuthor(new Author("Cameron Wallace McKenzie", "Cameron@gmail.com"));
	    
	     Long bookId = (Long) s.save(newBook);     
	    
	     /*Book book = (Book) s.get(Book.class, bookId);
	     System.out.println("Book's Title: " + book.getTitle());
	     System.out.println("Book's Description: " + book.getTitle());
	     
	     Author author = book.getAuthor();
	     System.out.println("Author's Name: " + author.getName());
	     System.out.println("Author's Email: " + author.getEmail());
	     */
	     
	     System.out.println("bookId::["+bookId+"]");
	     s.getTransaction().commit();
	     s.close();     
	}

}
