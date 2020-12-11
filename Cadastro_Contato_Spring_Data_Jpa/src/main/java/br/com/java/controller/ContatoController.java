package br.com.java.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.java.entity.Contato;
import br.com.java.service.ContatoService;

@Controller
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	
	@GetMapping("/contato")
	public String lista(Model model) {
		model.addAttribute("contatos", service.findAll());
		return "lista";
	}
	@GetMapping("/contato/search")
	public String search (@RequestParam("contato") String contato, Model model) {
		if (StringUtils.isEmpty(contato)) {
			return "redirect:/contato";
		}
		model.addAttribute("contatos",service.search(contato));
		return "lista";
	}
	@GetMapping("/contato/add")
	public String add (Model model) {
		model.addAttribute("contato", new Contato());
		return "form";
	
	}
	@GetMapping("/contato/{id}/edit")
	public String edit (@PathVariable("id") Integer id, Model model) {
		model.addAttribute("contato", service.findOne(id));
		return "form";
	}
	
	@GetMapping("/contato/save")
	public String save(@Valid Contato contato, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "form";
		}
		service.save(contato);
		redirect.addFlashAttribute("sucessMessage", "Contato salvo com sucesso!");
		return "redirect:/contato";
	}
	@GetMapping("/contato/{id}/delete")public String delete(@PathVariable int id, RedirectAttributes redirect) {
		service.delete(id);;
		redirect.addFlashAttribute("sucessMessage", "Contato deletado com sucesso!");
		return "redirect:/contato";
	}

}
