package book.shop;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookEntity -> new Book(bookEntity.getName(), bookEntity.getAuthor()))
                .toList();
    }
}
