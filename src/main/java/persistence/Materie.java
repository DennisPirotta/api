package persistence;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Materie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materie materie = (Materie) o;
        return id == materie.id && Objects.equals(nome, materie.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
