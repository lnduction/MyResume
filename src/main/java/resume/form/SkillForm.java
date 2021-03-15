package resume.form;

import resume.entity.Skills;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkillForm implements Serializable {

    @Valid
    private List<Skills> items = new ArrayList<>();

    public SkillForm() { super(); }

    public SkillForm(List<Skills> items) {
        super();
        this.items = items;
    }

    public List<Skills> getItems() { return items; }
    public void setItems(List<Skills> items) { this.items = items; }
}
