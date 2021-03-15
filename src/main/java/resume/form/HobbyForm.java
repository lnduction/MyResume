package resume.form;

import resume.entity.Hobbies;
import resume.entity.HobbyCategory;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HobbyForm implements Serializable {

    @Valid
    private List<Hobbies> items = new ArrayList<>();

    public HobbyForm() { super(); }

    public HobbyForm(List<Hobbies> items) {
        super();
        this.items = items;
    }

    public List<Hobbies> getItems() { return items; }

    public void setItems(List<Hobbies> items) { this.items = items; }

    public boolean contains(HobbyCategory category) {
        for(Hobbies hobby: items) if (hobby.getHobbyCategory().equals(category)) return true;
        return false;
    }
}
