package resume.entity;

import resume.annotation.constraints.EnglishLanguage;
import resume.model.LanguageType;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="hobby_category")
public class HobbyCategory extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "HOBBY_CATEGORY_ID_GENERATOR", sequenceName = "hobby_category_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOBBY_CATEGORY_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @Column(length=50, nullable = false) private String img;
    @Column(length=50, nullable = false)
    @EnglishLanguage
    @Size(min=1, max = 50)
    private String category;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() { return img; }
    public void setImg(String img) { this.img = img; }



}
