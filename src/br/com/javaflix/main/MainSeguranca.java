package br.com.javaflix.main;

import br.com.javaflix.model.Credencial;
import br.com.javaflix.model.Sede;

public class MainSeguranca {
    public static void main(String[] args) {
        Sede sede = new Sede();
        Credencial credencial = new Credencial("ABC123");

        sede.registrarPassagemCatraca(credencial);
        sede.registrarPassagemCatraca(credencial);

        sede.autorizarEntradaCofre(credencial);
        sede.autorizarEntradaCofre(credencial);

        sede.estacionarVeiculo("AAA-1111", 0);
        sede.estacionarVeiculo("BBB-2222", 1);
        sede.estacionarVeiculo("CCC-3333", 2);

        // A capacidade do array é exatamente 3; o índice 3 gera
        // ArrayIndexOutOfBoundsException, conforme solicitado na questão 20.
        sede.estacionarVeiculo("DDD-4444", 3);
    }
}
