package com.kodilla.testing.library;

import java.util.List;
public interface LibraryDatabase {
    //list has fragment of title
    List<Book> listBooksWithCondition(String titleFragment);

    //books borrowed by User
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //true if rent succes, false if book is unavailable
    boolean rentABook(LibraryUser libraryUser, Book book);

    //numbers books borrowed and books returned
    int returnBooks(LibraryUser libraryUser);
}
