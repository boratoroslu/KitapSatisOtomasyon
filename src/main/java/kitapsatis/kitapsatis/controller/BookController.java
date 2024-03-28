package kitapsatis.kitapsatis.controller;


import kitapsatis.kitapsatis.model.Book;
import kitapsatis.kitapsatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

@PostMapping("/save")
public ResponseEntity<Book> save(@RequestBody String name){
   return ResponseEntity.ok(bookService.save(name));
}
@GetMapping
public ResponseEntity<List<Book>> findAll(){return  ResponseEntity.ok(bookService.getAll());}


}
