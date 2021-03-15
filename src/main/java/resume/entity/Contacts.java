package resume.entity;


import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Access(AccessType.FIELD)
public class Contacts implements Serializable {

    @Column(nullable = false) @URL private String skype;
    @Column(nullable = false) @URL private String vkontakte;
    @Column(nullable = false) @URL private String facebook;
    @Column(nullable = false) @URL private String github;
    @Column(nullable = false) @URL private String linkedin;
    @Column(nullable = false) @URL private String stackoverflow;

    public Contacts(){super();}

    public String getSkype() { return skype; }
    public void setSkype(String skype) { this.skype = skype; }

    public String getVkontakte() { return vkontakte; }
    public void setVkontakte(String vkontakte) { this.vkontakte = vkontakte; }

    public String getFacebook() { return facebook; }
    public void setFacebook(String facebook) { this.facebook = facebook; }

    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }

    public String getLinkedin() { return linkedin; }
    public void setLinkedin(String linkedin) { this.linkedin = linkedin; }

    public String getStackoverflow() { return stackoverflow; }
    public void setStackoverflow(String stackoverflow) { this.stackoverflow = stackoverflow; }
}
