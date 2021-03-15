package resume.entity;

import resume.annotation.constraints.EnglishLanguage;
import resume.model.LanguageLevel;
import resume.model.LanguageType;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="languages")
public class Languages extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "LANGUAGES_ID_GENERATOR", sequenceName = "languages_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LANGUAGES_ID_GENERATOR")
    @Column private Long id;

    @Column
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    @Size(min=1)
    private String language;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable=false)
    @Convert(converter = LanguageLevel.PersistJPAConverter.class)
    private LanguageLevel level;

    @Column
    @Convert(converter = LanguageType.PersistJPAConverter.class)
    private LanguageType type;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    public LanguageLevel getLevel() { return level; }
    public void setLevel(LanguageLevel level) { this.level = level; }

    public LanguageType getType() { return type; }
    public void setType(LanguageType type) { this.type = type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Languages languages = (Languages) o;
        return Objects.equals(id, languages.id) &&
                Objects.equals(type, languages.type) &&
                Objects.equals(language, languages.language) &&
                Objects.equals(level, languages.level) &&
                Objects.equals(account, languages.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, type, language, level, account);
    }
}
