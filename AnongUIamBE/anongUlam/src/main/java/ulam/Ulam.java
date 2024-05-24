package ulam;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ulam {
	@Id
	@GeneratedValue
	private Integer id;
	private String ulamName;
	private List<String> ingredients;
	private List<String> preparations;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUlamName() {
		return ulamName;
	}
	public void setUlamName(String ulamName) {
		this.ulamName = ulamName;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public List<String> getPreparations() {
		return preparations;
	}
	public void setPreparations(List<String> preparations) {
		this.preparations = preparations;
	}
	
	

}
