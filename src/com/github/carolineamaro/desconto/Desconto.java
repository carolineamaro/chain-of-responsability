package com.github.carolineamaro.desconto;

import com.github.carolineamaro.modelo.Orcamento;

public abstract class Desconto {
    
    protected Desconto proximo = null;
    
    abstract protected double calcula(Orcamento orcamento);
    
    public double getDesconto(Orcamento orcamento){
        double desconto = this.calcula(orcamento);
        if(desconto > 0){
            return desconto;
        }
        
        if(this.proximo == null){
            return 0;
        }else{
            return this.proximo.getDesconto(orcamento);
        }
    }
    
    public void setProximo(Desconto proximo){
        this.proximo = proximo;
    }
}
