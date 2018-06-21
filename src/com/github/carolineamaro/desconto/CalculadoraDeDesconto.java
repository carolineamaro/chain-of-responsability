package com.github.carolineamaro.desconto;

import com.github.carolineamaro.modelo.Orcamento;


public class CalculadoraDeDesconto {
    
    public double getDesconto(Orcamento orcamento){
        if(orcamento.getItens().size() > 2){
            return orcamento.getValorTotal() * 0.05;
        }
        
        return 0;
    }
}
