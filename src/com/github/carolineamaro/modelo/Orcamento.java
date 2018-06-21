package com.github.carolineamaro.modelo;

import com.github.carolineamaro.desconto.Desconto;
import com.github.carolineamaro.desconto.DescontoOrcamentoMaisDeDoisItens;
import com.github.carolineamaro.desconto.DescontoOrcamentoValorMaiorQueSeisMil;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private List<Produto> itens;

    public Orcamento() {
        this.itens = new ArrayList<>();
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void addItem(Produto produto) {
        this.itens.add(produto);
    }

    public double getValorTotal() {
        if (this.itens.size() > 0) {
            double total = 0;

            for (Produto p : this.itens) {
                total += p.getValor();
            }

            return total;
        }

        return 0;
    }
    
    public double getValorDesconto(){
        Desconto maisDeDoisItens = new DescontoOrcamentoMaisDeDoisItens();
        Desconto maiorQueSeisMil = new DescontoOrcamentoValorMaiorQueSeisMil();
        
        maisDeDoisItens.setProximo(maiorQueSeisMil);
        
        return maisDeDoisItens.getDesconto(this);
    }
}
