package com.github.carolineamaro.modelo;

import com.github.carolineamaro.desconto.CalculadoraDeDesconto;
import org.junit.*;
import static org.junit.Assert.*;

public class OrcamentoTest {

  
    /**
     * Compra sem desconto
     */
    @Test
    public void testOrcamentoSemDesconto() {
        
        Orcamento orcamento = new Orcamento();
        orcamento.addItem(new Produto("Iphone 5s", 3000.00));
        
        assertEquals(0.00, orcamento.getValorDesconto(), 0.001);
    }

    /**
     * Toda compra com mais de 2 itens tem desconto de 5%
     */
    @Test
    public void testOrcamentoComDescontoDeCincoPorCento() {
        
        Orcamento orcamento = new Orcamento();
        orcamento.addItem(new Produto("Televisão", 1500.00));
        orcamento.addItem(new Produto("Caixa de som", 680.00));
        orcamento.addItem(new Produto("Notebook", 3200.00));
        
        assertEquals(269.00, orcamento.getValorDesconto(), 0.001);
    }
    
    /**
     * Toda compra com o valor total maior que 5 mil reais tem desconto de 10%
     */
    @Test
    public void testOrcamentoComDescontoDeDezPorCento() {
        
        Orcamento orcamento = new Orcamento();
        orcamento.addItem(new Produto("Computador", 4000.00));
        orcamento.addItem(new Produto("Mouse", 1100.00));
        
        assertEquals(510.00, orcamento.getValorDesconto(), 0.001);
    }
    
    

}
