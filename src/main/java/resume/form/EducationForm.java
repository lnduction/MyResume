package resume.form;

import resume.entity.Education;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EducationForm implements Serializable {

    @Valid
    private List<Education> items = new ArrayList<>();

    public EducationForm() { super(); }

    public EducationForm(List<Education> items) {
        super();
        this.items = items;
    }

    public List<Education> getItems() { return items; }
    public void setItems(List<Education> items) { this.items = items; }
}
