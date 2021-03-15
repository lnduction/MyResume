package resume.form;

import resume.entity.Contacts;

import javax.validation.Valid;
import java.io.Serializable;

public class ContactsForm implements Serializable {

    @Valid
    private Contacts item = new Contacts();

    public ContactsForm() {super();}

    public ContactsForm(Contacts item) {
        super();
        this.item = item;
    }

    public Contacts getItem() { return item; }
    public void setItem(Contacts item) { this.item = item; }
}
