package kitapsatis.kitapsatis.service;

import kitapsatis.kitapsatis.model.Book;
import kitapsatis.kitapsatis.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
   @Autowired
    private BookRepository bookRepository;

public Book save(String name){
Book book = new Book();
book.setName(name);
return bookRepository.save(book);
}

public List<Book> getAll(){
try {
return bookRepository.findAll();
}catch (Exception e){
throw new RuntimeException("Üürünler bulunamadı!");
}
}
     public Book findById(Integer bookId){
return bookRepository.findById(bookId).orElseThrow();
     }

}
