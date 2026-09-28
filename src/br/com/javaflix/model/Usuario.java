package br.com.javaflix.model;

import java.util.Objects;

public class Usuario {
    public static final String NOME_PLATAFORMA = "JavaFlix";

    private String nome;
    private String email;
    private boolean ativo;
    private static int totalUsuarios;

    public Usuario(String nome, String email, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        totalUsuarios++;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public static int getTotalUsuarios() {
        return totalUsuarios;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " | Contato: " + email + " | Ativo: " + ativo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario outro = (Usuario) obj;
        return Objects.equals(email, outro.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
