package br.com.programadorc.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "nome")
    @Size(min = 1, max = 100)
    private String nome;

    @NotNull
    @Column(name = "email", unique = true)
    @Size(min = 1, max = 45)
    @Email
    private String email;

    @NotNull
    @Column(name = "senha")
    @Size(min = 6, max = 100)
    private String senha;

    private Integer pontos;

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Integer id, String nome, String email, String senha, Integer pontos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.pontos = pontos;
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
