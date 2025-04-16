package kr.ac.kopo.ohm.bookmarket.service;

import kr.ac.kopo.ohm.bookmarket.domain.Book;
import kr.ac.kopo.ohm.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }

    @Override
    public Book getBookById(String bookId) {
        return bookRepository.getBookById(bookId);
    }

    @Override
    public List<Book> getAllBookListByCategory(String category) {
        List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
        return booksByCategory;
    }
}
