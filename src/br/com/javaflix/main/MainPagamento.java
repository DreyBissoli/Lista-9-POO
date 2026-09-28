package br.com.javaflix.main;

import br.com.javaflix.model.Pagamento;
import br.com.javaflix.model.PagamentoCartao;
import br.com.javaflix.model.PagamentoPix;
import br.com.javaflix.model.ProcessadorPagamento;

public class MainPagamento {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pagamento pagamentoPix = new PagamentoPix();
        Pagamento pagamentoCartao = new PagamentoCartao();

        processador.finalizarCompra(99.90, pagamentoPix);
        processador.finalizarCompra(149.90, pagamentoCartao);
    }
}
