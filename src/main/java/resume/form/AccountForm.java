package resume.form;

import resume.entity.Account;

import javax.validation.Valid;
import java.io.Serializable;

public class AccountForm implements Serializable {

    @Valid
    private Account item = new Account();

    public AccountForm() {super();}

    public AccountForm(Account item) {
        super();
        this.item = item;
    }

    public Account getItem() { return item; }
    public void setItem(Account item) { this.item = item; }
}
