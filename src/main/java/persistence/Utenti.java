package persistence;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Utenti {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Basic
    @Column(name = "cognome", nullable = false, length = 50)
    private String cognome;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Basic
    @Column(name = "data_nascita", nullable = false)
    private Date dataNascita;
    @Basic
    @Column(name = "indirizzo", nullable = false, length = 100)
    private String indirizzo;
    @Basic
    @Column(name = "password", nullable = false, length = 200)
    private String password;

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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utenti utenti = (Utenti) o;
        return id == utenti.id && Objects.equals(nome, utenti.nome) && Objects.equals(cognome, utenti.cognome) && Objects.equals(email, utenti.email) && Objects.equals(dataNascita, utenti.dataNascita) && Objects.equals(indirizzo, utenti.indirizzo) && Objects.equals(password, utenti.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, email, dataNascita, indirizzo, password);
    }
}
