package resume.form;

import resume.entity.Courses;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseForm implements Serializable {

    @Valid
    private List<Courses> items = new ArrayList<>();

    public CourseForm() { super(); }

    public CourseForm(List<Courses> items) {
        super();
        this.items = items;
    }

    public List<Courses> getItems() { return items; }
    public void setItems(List<Courses> items) { this.items = items; }
}
