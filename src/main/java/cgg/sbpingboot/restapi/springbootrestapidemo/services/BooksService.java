package cgg.sbpingboot.restapi.springbootrestapidemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cgg.sbpingboot.restapi.springbootrestapidemo.dao.BookRepository;
import cgg.sbpingboot.restapi.springbootrestapidemo.entities.Book;
@Component
public class BooksService {
    @Autowired
    private BookRepository bookRepository;
    // private static List<Book> books=new ArrayList<>();

    // static
    // {
    //     books.add(new Book(5,"java head first","abc"));
    //     books.add(new Book(12,"java complete ref","xyz"));
    //     books.add(new Book(1212,"think in java","lmn"));

    // }
    //get all books
    public List<Book> getBooks(){
        List<Book> book = bookRepository.findAll();
        return book;
    }

    //get single Ōbook by id
    public Book getBookById(int id)
    {
    //    Book book= books.stream().filter(b->b.getBookId()==id).findFirst().get();
    //    return book;
    Book b=bookRepository.findById(id).get();
    return b;
    
    }
    //adding a book 
    public Book addBook(Book book)
    {
        Book b=bookRepository.save(book);
        return b;
    }
    //updating a book
    public void updateBook(Book book,int id)
    {

        // books=books.stream().map(b->{
        //     if(b.getBookId()==id)
        //     {
        //         b.setAuthor(book.getAuthor());
        //         b.setTitle(book.getTitle());
               

        //     }
        //      return b;
        // }).collect(Collectors.toList());
        // return books;

            Book b=bookRepository.findById(id).get();
            b.setAuthor(book.getAuthor());
            b.setTitle(book.getTitle());
           bookRepository.save(b);
            

    }
    //deleting a book
    public void deleteBook(int id)
    {
    //    books= books.stream().filter(b->b.getBookId()!=id).collect(Collectors.toList());

        bookRepository.deleteById(id);
    }
}
