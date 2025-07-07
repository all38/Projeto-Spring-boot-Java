package com.example.produtosapi.cotroller;

import com.example.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoControler {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {

        System.out.println("Produto recebido: " + produto);

        return produto;
    }
}
