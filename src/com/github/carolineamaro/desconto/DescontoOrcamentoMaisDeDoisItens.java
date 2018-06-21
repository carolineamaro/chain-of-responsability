package com.github.carolineamaro.desconto;

import com.github.carolineamaro.modelo.Orcamento;

public class DescontoOrcamentoMaisDeDoisItens extends Desconto {

    @Override
    protected double calcula(Orcamento orcamento) {
        if (orcamento.getItens().size() > 2) {
            return orcamento.getValorTotal() * 0.05;
        }
        return 0;
    }

}
