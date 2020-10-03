package br.edu.uniso.apicombanco;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// essa classe representa a tabela Aluno
@Entity
@Table(name="ALUNO", schema="tiopalma_sempermissao")
public class Aluno {

    @Id
    private int ra;

    @Column(name="primeiro_nome")
    private String primeiroNome;

    private String sobrenome;

    private int idade;


    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
