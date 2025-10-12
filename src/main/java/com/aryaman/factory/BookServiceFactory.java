package com.aryaman.factory;

import com.aryaman.service.BookService;
import com.aryaman.service.impl.BookServiceImpl;
import com.aryaman.service.impl.BookServiceImplNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookServiceFactory {

    @Autowired private BookServiceImpl bookServiceOldImpl;

    @Autowired private BookServiceImplNew bookServiceImplNew;

    public BookService getBookService(boolean old) {
        return old ? bookServiceOldImpl : bookServiceImplNew;
    }

    public BookService getBookService() {
        return bookServiceOldImpl;
    }

}
