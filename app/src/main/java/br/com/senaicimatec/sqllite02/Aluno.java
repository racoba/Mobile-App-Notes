package br.com.senaicimatec.sqllite02;

import java.io.Serializable;
import java.util.Date;

public class Aluno implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private String idade;
    private Date cadastro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) { this.cadastro = new Date(cadastro); }

}