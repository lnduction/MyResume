package resume.form;

import resume.entity.Languages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LanguageForm implements Serializable {

    private List<Languages> items = new ArrayList<>();

    public LanguageForm() { super(); }

    public LanguageForm(List<Languages> items) {
        super();
        this.items = items;
    }

    public List<Languages> getItems() { return items; }
    public void setItems(List<Languages> items) { this.items = items; }
}
