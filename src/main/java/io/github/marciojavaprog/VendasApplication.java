package io.github.marciojavaprog;


import io.github.marciojavaprog.domain.entity.Cliente;
import io.github.marciojavaprog.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController

public class VendasApplication {

    @Bean

    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {

            clientes.salvar(new Cliente("Marcio"));
            clientes.salvar(new Cliente("Ana Paula"));
            clientes.salvar(new Cliente("Lucas"));
            clientes.salvar(new Cliente("Daniel"));

            List<Cliente>  todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);


        };
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }

}
