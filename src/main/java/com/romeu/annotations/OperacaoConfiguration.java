package com.romeu.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OperacaoConfiguration {

    @Bean(name = "leitura")
    public Operacao leitura() {
        return new Operacao() {
            @Override
            public void acao() {
                System.out.println("Operação de leitura selecionada");
            }
        };
    }

    @Bean(name = "escrita")
    public Operacao escrita() {
        return new Operacao() {
            @Override
            public void acao() {
                System.out.println("Operação de escrita selecionada");
            }
        };
    }
}
