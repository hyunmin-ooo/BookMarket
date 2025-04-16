package kr.ac.kopo.ohm.bookmarket.repository;

import kr.ac.kopo.ohm.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBookListByCategory(String category);
}
