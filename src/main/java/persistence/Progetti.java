package persistence;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Progetti {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "image", nullable = false, length = 100)
    private String image;
    @Basic
    @Column(name = "url", nullable = false, length = 100)
    private String url;
    @Basic
    @Column(name = "description", nullable = false, length = 200)
    private String description;
    @Basic
    @Column(name = "titolo", nullable = false, length = 50)
    private String titolo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Progetti progetti = (Progetti) o;
        return id == progetti.id && Objects.equals(image, progetti.image) && Objects.equals(url, progetti.url) && Objects.equals(description, progetti.description) && Objects.equals(titolo, progetti.titolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, url, description, titolo);
    }
}
