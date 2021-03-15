package resume.entity;

import org.hibernate.validator.constraints.URL;
import org.joda.time.DateTime;
import resume.annotation.constraints.EnglishLanguage;
import resume.annotation.constraints.FirstFiledLessThanSecond;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="practices")
@FirstFiledLessThanSecond(first = "startDate", second = "endDate")
public class Practices extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "PRACTICES_ID_GENERATOR", sequenceName = "practices_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRACTICES_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @Column(length = 100, nullable = false)
    @EnglishLanguage
    @Size(min=1)
    private String position;

    @Column(length = 100, name = "company_or_organisation", nullable = false)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    @Size(min=1)
    private String companyOrOrganisation;

    @Column(name = "responsibilities_progress", nullable = false)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    @Size(min=1)
    private String responsibilitiesProgress;

    @Column(length = 200, name = "demo_link", nullable = false) @URL private String demoLink;
    @Column(length = 200, name = "source_code_link", nullable = false) @URL private String sourceDemoLink;

    @Column(name = "start_date", nullable = false) private Date startDate;
    @Column(name = "end_date", nullable = false) private Date endDate;

    @Transient private Integer mouthStart;
    @Transient private Integer mouthEnd;

    @Transient private Integer yearStart;
    @Transient private Integer yearEnd;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getCompanyOrOrganisation() { return companyOrOrganisation; }
    public void setCompanyOrOrganisation(String companyOrOrganisation) { this.companyOrOrganisation = companyOrOrganisation; }

    public String getResponsibilitiesProgress() { return responsibilitiesProgress; }
    public void setResponsibilitiesProgress(String responsibilitiesProgress) { this.responsibilitiesProgress = responsibilitiesProgress; }

    public String getDemoLink() { return demoLink; }
    public void setDemoLink(String demoLink) { this.demoLink = demoLink; }

    public String getSourceDemoLink() { return sourceDemoLink; }
    public void setSourceDemoLink(String sourceDemoLink) { this.sourceDemoLink = sourceDemoLink; }

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
        Practices practices = (Practices) o;
        return Objects.equals(id, practices.id) &&
                Objects.equals(position, practices.position) &&
                Objects.equals(companyOrOrganisation, practices.companyOrOrganisation) &&
                Objects.equals(responsibilitiesProgress, practices.responsibilitiesProgress) &&
                Objects.equals(demoLink, practices.demoLink) &&
                Objects.equals(sourceDemoLink, practices.sourceDemoLink) &&
                Objects.equals(startDate, practices.startDate) &&
                Objects.equals(endDate, practices.endDate) &&
                Objects.equals(account, practices.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, position, companyOrOrganisation, responsibilitiesProgress, demoLink, sourceDemoLink, startDate, endDate, account);
    }

    @Transient
    public Integer getMouthStart() {
        if(startDate == null) return null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        return calendar.get(Calendar.MONTH);
    }

    @Transient
    public Integer getMouthEnd() {
        if(endDate == null) return null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(endDate);
        return calendar.get(Calendar.MONTH);
    }

    @Transient
    public Integer getYearStart() {
        if(startDate == null) return null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        return calendar.get(Calendar.YEAR);
    }

    @Transient
    public Integer getYearEnd() {
        if(endDate == null) return null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(endDate);
        return calendar.get(Calendar.YEAR);
    }

    public void setMouthStart(Integer mouthStart) {
        this.mouthStart = mouthStart;
        setupStartDate();
    }
    public void setMouthEnd(Integer mouthEnd) {
        this.mouthEnd = mouthEnd;
        setupEndDate();
    }

    public void setYearStart(Integer yearStart) {
        this.yearStart = yearStart;
        setupStartDate();
    }

    public void setYearEnd(Integer yearEnd) {
        this.yearEnd = yearEnd;
        setupEndDate();
    }

    private void setupStartDate() {
        if (mouthStart != null && yearStart != null) {
            setStartDate(new Date(new DateTime(yearStart, mouthStart, 1, 0, 0).getMillis()));
        } else setStartDate(null);
    }

    private void setupEndDate() {
        if (mouthEnd != null && yearEnd != null) {
            setEndDate(new Date(new DateTime(yearEnd, mouthEnd, 1, 0, 0).getMillis()));
        } else setEndDate(null);
    }


}
