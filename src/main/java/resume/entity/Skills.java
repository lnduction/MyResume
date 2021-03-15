package resume.entity;

import resume.annotation.constraints.EnglishLanguage;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="skills")
public class Skills extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "SKILLS_ID_GENERATOR", sequenceName = "skills_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SKILLS_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @Column(name = "framework_and_technology", nullable = false)
    @EnglishLanguage
    @Size(min=1)
    private String frameworkAndTechnology;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "category", nullable = false)
    private SkillCategory skillCategory;

    public Skills() {}

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFrameworkAndTechnology() { return frameworkAndTechnology; }
    public void setFrameworkAndTechnology(String frameworkAndTechnology) { this.frameworkAndTechnology = frameworkAndTechnology; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    public SkillCategory getSkillCategory() { return skillCategory; }
    public void setSkillCategory(SkillCategory skillCategory) { this.skillCategory = skillCategory; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Skills skills = (Skills) o;
        return id.equals(skills.id) &&
                frameworkAndTechnology.equals(skills.frameworkAndTechnology) &&
                skillCategory.equals(skills.skillCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, frameworkAndTechnology, skillCategory);
    }
}
