package resume.entity;

import resume.annotation.constraints.PasswordStrength;
import resume.annotation.constraints.Phone;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
@Access(AccessType.FIELD)
public class Privacy {

    @Column(nullable = false)
    @PasswordStrength
    @Size(max = 100)
    private String password;

    @Column(length = 50, nullable = false)
    @Phone
    @Size(min=7, max = 20)
    private String phone;

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
