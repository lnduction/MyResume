package resume.entity;

import org.springframework.format.annotation.DateTimeFormat;
import resume.annotation.constraints.EnglishLanguage;
import resume.annotation.constraints.FirstFiledLessThanSecond;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="courses")
@FirstFiledLessThanSecond(first = "startDate", second = "endDate")
public class Courses extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "COURSES_ID_GENERATOR", sequenceName = "courses_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURSES_ID_GENERATOR")
    @Column private Long id;

    @Column(length = 100, nullable = false)
    @EnglishLanguage
    @Size(min=1, max = 100)
    private String name;

    @Column(length = 100, nullable = false)
    @EnglishLanguage
    @Size(min=1, max = 100)
    private String organisation;

    @Column(name = "start_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getOrganisation() { return organisation; }
    public void setOrganisation(String organisation) { this.organisation = organisation; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Courses courses = (Courses) o;
        return Objects.equals(id, courses.id) &&
                Objects.equals(name, courses.name) &&
                Objects.equals(organisation, courses.organisation) &&
                Objects.equals(startDate, courses.startDate) &&
                Objects.equals(endDate, courses.endDate) &&
                Objects.equals(account, courses.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, organisation, startDate, endDate, account);
    }
}
