package com.fatec.scell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.scell.model.AlunoRepository;
import com.fatec.scell.model.Emprestimo;
import com.fatec.scell.model.EmprestimoRepository;
import com.fatec.scell.model.LivroRepository;
import com.fatec.scell.model.Servico;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(path = "/emprestimos")
public class EmprestimoController {
	@Autowired
	private EmprestimoRepository emprestimoRepository;
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private Servico servico;

	/**
	 * quando o usuario digita localhost:8080/emprestimo/cadastrar
	 *
	 * @param emprestimo
	 * @return o html /RegistrarEmprestimo
	 */
	@GetMapping("/cadastrar")
	public ModelAndView registrarEmprestimo(Emprestimo emprestimo) {
		ModelAndView mv = new ModelAndView("RegistrarEmprestimo");
		mv.addObject("emprestimo", emprestimo);
		return mv;
	}
}
