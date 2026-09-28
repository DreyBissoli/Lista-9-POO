package br.com.javaflix.main;

import br.com.javaflix.model.Usuario;

public class MainMemoria {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana", "ana@email.com", true);
        Usuario usuario2 = new Usuario("Ana Souza", "ana@email.com", false);

        if (usuario1.equals(usuario2)) {
            System.out.println("Os usuários são logicamente iguais.");
        } else {
            System.out.println("Os usuários são diferentes.");
        }

        System.out.println("Plataforma: " + Usuario.NOME_PLATAFORMA);
        System.out.println("Total de usuários: " + Usuario.getTotalUsuarios());
    }
}
