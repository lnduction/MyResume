package resume.entity;

import org.hibernate.validator.constraints.Email;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.springframework.format.annotation.DateTimeFormat;
import resume.annotation.constraints.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="account")
public class Account extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "CREATE_ID_GENERATOR", sequenceName = "account_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CREATE_ID_GENERATOR")
    @Column(nullable = false) private Long id;

    @Column(length = 50, name = "first_name", nullable = false)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    private String firstName;

    @Column(length = 50, name = "last_name", nullable = false)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    private String lastName;

    @Column(length = 50, name = "middle_name", nullable = false)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    private String middleName;

    @Column(length = 50, nullable = false)
    @Size(min = 1, max = 20)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    private String country;

    @Column(length = 50, nullable = false)
    @Size(min = 1, max = 20)
    @EnglishLanguage(withNumbers = false, withSpechSymbols = false, withPunctuations = false)
    private String city;

    @Column(length = 50, nullable = false)
    @Email
    @Size(min = 1, max = 50)
    private String email;

    @Column(length = 200, name = "preferred_work", nullable = false)
    @Size(min = 1, max = 200)
    @EnglishLanguage
    private String preferredWork;

    @Column(nullable = false)
    @Size(min = 1)
    @EnglishLanguage
    private String qualification;

    @Column(length = 100) private String uid;

    @Column(length = 255, nullable = false) private String photo;
    @Column(length = 255, name = "small_photo", nullable = false) private String smallPhoto;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Adulthood
    private Date birthday;

    @Column(nullable = false)
    @Size(min = 1)
    @EnglishLanguage
    private String info;

    @Column(nullable = false) private Boolean completed;
    @Column(nullable = false) private Date created;


    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("id asc")
    private List<Certificates> certificates;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("endDate asc")
    private List<Courses> courses;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("endYear desc, startYear desc , id desc")
    private List<Education> educations;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("id asc")
    private List<Languages> languages;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("endDate asc")
    private List<Practices> practices;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("id asc ")
    private List<Skills> skills;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    @OrderBy("id asc")
    private List<Hobbies> hobbies;

    @Embedded private Contacts contacts;
    @Embedded private Privacy privacy;

    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPreferredWork() { return preferredWork; }
    public void setPreferredWork(String preferredWork) { this.preferredWork = preferredWork; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public String getSmallPhoto() { return smallPhoto; }
    public void setSmallPhoto(String smallPhoto) { this.smallPhoto = smallPhoto; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public String getInfo() { return info; }
    public void setInfo(String info) { this.info = info; }

    public Date getCreated() { return created; }
    public void setCreated(Date created) { this.created = created; }

    public Boolean getCompeted() { return completed; }
    public void setCompeted(Boolean completed) { this.completed = completed; }

    public List<Certificates> getCertificates() { return certificates; }
    public void setCertificates(List<Certificates> certificates) { this.certificates = certificates; }

    public List<Courses> getCourses() { return courses; }
    public void setCourses(List<Courses> courses) { this.courses = courses; }

    public List<Education> getEducations() { return educations; }
    public void setEducations(List<Education> educations) { this.educations = educations; }

    public List<Languages> getLanguages() { return languages; }
    public void setLanguages(List<Languages> languages) { this.languages = languages; }

    public List<Practices> getPractices() { return practices; }
    public void setPractices(List<Practices> practices) { this.practices = practices; }

    public List<Skills> getSkills() { return skills; }
    public void setSkills(List<Skills> skills) { this.skills = skills; }

    public List<Hobbies> getHobbies() { return hobbies; }
    public void setHobbies(List<Hobbies> hobbies) { this.hobbies = hobbies; }

    public Privacy getPrivacy() { return privacy; }
    public void setPrivacy(Privacy privacy) { this.privacy = privacy; }

    public String getUid() { return uid; }
    public void setUid(String uid) { this.uid = uid; }

    public Contacts getContacts() {
        if(contacts == null) return new Contacts();
        return contacts;
    }

    public void setContacts(Contacts contacts) { this.contacts = contacts; }

    public String updateProfilePhotos(String photo, String smallPhoto) {
        String oldLargeImage = this.photo;
        setPhoto(photo);
        setSmallPhoto(smallPhoto);
        return oldLargeImage;
    }

    @Transient
    public int getAge(){
        LocalDate birthdate = new LocalDate(birthday);
        LocalDate now = new LocalDate();
        Years age = Years.yearsBetween(birthdate, now);
        return age.getYears();
    }

    @Transient
    public String getFullName() {
        return firstName + " " + lastName;
    }

    private void updateListSetAccount(List<? extends AccountEntity> list) {
        if(list != null) {
            for(AccountEntity entity : list) {
                entity.setAccount(this);
            }
        }
    }
}

