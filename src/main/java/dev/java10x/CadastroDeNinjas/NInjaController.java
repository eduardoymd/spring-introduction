package dev.java10x.CadastroDeNinjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NInjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Java para primatas!";
    }
}
