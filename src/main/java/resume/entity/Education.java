package resume.entity;

import resume.annotation.constraints.EnglishLanguage;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="education")
public class Education extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "EDUCATION_ID_GENERATOR", sequenceName = "education_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EDUCATION_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @Column(nullable = false)
    @EnglishLanguage
    @Size(min=1)
    private String specialisation;

    @Column(length = 100, nullable = false)
    @EnglishLanguage
    @Size(min=1, max = 100)
    private String university;

    @Column(length = 100, nullable = false)
    @EnglishLanguage
    @Size(min=1, max = 100)
    private String faculty;

    @Column(name = "start_year", nullable = false) private Short startYear;
    @Column(name = "end_year", nullable = false) private Short endYear;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSpecialisation() { return specialisation; }
    public void setSpecialisation(String specialisation) { this.specialisation = specialisation; }

    public String getUniversity() { return university; }
    public void setUniversity(String university) { this.university = university; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public Short getStartYear() { return startYear; }
    public void setStartYear(Short startYear) { this.startYear = startYear; }

    public Short getEndYear() { return endYear; }
    public void setEndYear(Short endYear) { this.endYear = endYear; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Education education = (Education) o;
        return Objects.equals(id, education.id) &&
                Objects.equals(specialisation, education.specialisation) &&
                Objects.equals(university, education.university) &&
                Objects.equals(faculty, education.faculty) &&
                Objects.equals(startYear, education.startYear) &&
                Objects.equals(endYear, education.endYear) &&
                Objects.equals(account, education.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, specialisation, university, faculty, startYear, endYear, account);
    }
}
