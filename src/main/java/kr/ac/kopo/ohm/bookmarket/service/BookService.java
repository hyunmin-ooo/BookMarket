package kr.ac.kopo.ohm.bookmarket.service;

import kr.ac.kopo.ohm.bookmarket.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book>getAllBookListByCategory(String category);
}
