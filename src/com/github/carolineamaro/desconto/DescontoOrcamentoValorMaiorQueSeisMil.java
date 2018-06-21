package com.github.carolineamaro.desconto;

import com.github.carolineamaro.modelo.Orcamento;

public class DescontoOrcamentoValorMaiorQueSeisMil extends Desconto {

    @Override
    protected double calcula(Orcamento orcamento) {
        if (orcamento.getValorTotal() > 6000) {
            return orcamento.getValorTotal() * 0.10;
        }
        return 0;
    }

}
