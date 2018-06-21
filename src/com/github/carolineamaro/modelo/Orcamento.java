package com.github.carolineamaro.modelo;

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
        if(this.getItens().size() > 2){
            return this.getValorTotal() * 0.05;
        }else if(this.getValorTotal() > 5000.00){
            return this.getValorTotal() * 0.10;
        }else{
            return 0;
        }
    }
}
