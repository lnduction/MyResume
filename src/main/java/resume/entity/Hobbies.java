package resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="hobbies")
public class Hobbies extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "HOBBIES_ID_GENERATOR", sequenceName = "hobbies_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOBBIES_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "hobby_id", nullable = false)
    private HobbyCategory hobbyCategory;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    public HobbyCategory getHobbyCategory() { return hobbyCategory; }
    public void setHobbyCategory(HobbyCategory hobbyCategory) { this.hobbyCategory = hobbyCategory; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hobbies hobbies = (Hobbies) o;
        return Objects.equals(id, hobbies.id) &&
                Objects.equals(account, hobbies.account) &&
                Objects.equals(hobbyCategory, hobbies.hobbyCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, account, hobbyCategory);
    }
}
