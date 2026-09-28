package br.com.javaflix.main;

import br.com.javaflix.model.Usuario;
import br.com.javaflix.model.Video;

public class MainStreaming {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João Silva", "joao@email.com", true);

        Video video1 = new Video("O Início", 120);
        Video video2 = new Video("Teste de Validação", -45);

        System.out.println(usuario);
        System.out.println(video1);
        System.out.println("Duração final do segundo vídeo: "
                + video2.getDuracaoMinutos() + " minuto(s)");
    }
}
