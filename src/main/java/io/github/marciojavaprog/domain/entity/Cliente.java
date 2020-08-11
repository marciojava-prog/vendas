package io.github.marciojavaprog.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cliente {

    private Integer id;
    private String nome;


    public Cliente(String nome) {
        this.nome = nome;
    }
}
