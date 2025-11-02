package br.com.isabela.at1_ci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/nome")
    public String meuNome() {
        
        return "Isabela Chaves Pedroso";
    }
}
