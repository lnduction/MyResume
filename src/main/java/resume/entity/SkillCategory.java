package resume.entity;

import resume.annotation.constraints.EnglishLanguage;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="skill_category")
public class SkillCategory extends AbstractEntity<Long> implements Serializable {
	
	@Id
	@SequenceGenerator(name = "SKILL_CATEGORY_ID_GENERATOR", sequenceName = "skill_category_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SKILL_CATEGORY_ID_GENERATOR")
	@Column(nullable = false) private Long id;
	
	@Column(nullable=false, length=50)
	@EnglishLanguage
	@Size(min=1)
	private String category;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
