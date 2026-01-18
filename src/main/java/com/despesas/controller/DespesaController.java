package com.despesas.controller;

import com.despesas.entity.Despesa;
import com.despesas.repository.DespesaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepository;

    // GET - Listar todas as despesas
    @GetMapping
    public String listar(Model model) {
        List<Despesa> despesas = despesaRepository.findAll();
        BigDecimal somaTotal = despesaRepository.somaTotal();

        model.addAttribute("despesas", despesas);
        model.addAttribute("somaTotal", somaTotal);
        model.addAttribute("novaDespesa", new Despesa());

        return "despesas/lista";
    }

    // POST - Criar nova despesa
    @PostMapping
    public String criar(@Valid @ModelAttribute Despesa despesa) {
        despesaRepository.save(despesa);
        return "redirect:/despesas";
    }

    // DELETE - Remover despesa
    @PostMapping("/{id}/deletar")
    public String deletar(@PathVariable Long id) {
        despesaRepository.deleteById(id);
        return "redirect:/despesas";
    }
}
