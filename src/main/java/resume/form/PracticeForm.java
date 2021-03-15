package resume.form;

import resume.entity.Practices;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PracticeForm implements Serializable {

    @Valid
    private List<Practices> items = new ArrayList<>();

    public PracticeForm() { super(); }

    public PracticeForm(List<Practices> items) {
        super();
        this.items = items;
    }

    public List<Practices> getItems() { return items; }
    public void setItems(List<Practices> items) { this.items = items; }
}
