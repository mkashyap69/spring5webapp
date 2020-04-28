package guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepositories;

@Controller
public class BookController {
	
	
	private final BookRepositories bookRepository;
	
	

	
	public BookController(BookRepositories bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}




	@RequestMapping("/books")
	public String getBooks(Model model)
	{
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
}
