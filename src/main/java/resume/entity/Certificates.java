package resume.entity;

import resume.annotation.constraints.EnglishLanguage;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="certificates")
public class Certificates extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "CERTIFICATES_ID_GENERATOR", sequenceName = "certificates_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CERTIFICATES_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @Column(length = 255, nullable = false) private String photo;

    @Column(length = 100, nullable = false)
    @EnglishLanguage
    @Size(min=1, max = 100)
    private String name;

    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Certificates that = (Certificates) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(name, that.name) &&
                Objects.equals(account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, photo, name, account);
    }
}
