package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepositories;

@Component
public class AuthorController {
	
	private final AuthorRepositories authorRepository;

	public AuthorController(AuthorRepositories authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	
	@RequestMapping("/author")
	public String getAuthor(Model model)
	{
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
	
	

}
