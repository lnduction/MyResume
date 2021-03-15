package resume.form;

import resume.entity.Certificates;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CertificateForm implements Serializable {

    private List<Certificates> items = new ArrayList<>();

    public CertificateForm() { super(); }

    public CertificateForm(List<Certificates> items) {
        super();
        this.items = items;
    }

    public List<Certificates> getItems() { return items; }
    public void setItems(List<Certificates> items) { this.items = items; }
}
