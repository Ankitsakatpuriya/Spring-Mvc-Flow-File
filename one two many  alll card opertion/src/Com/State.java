package Com;

import java.util.Set;

public class State {
	private int id = 0;
	private String Statename = null;
	private Set childern;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatename() {
		return Statename;
	}
	public void setStatename(String statename) {
		Statename = statename;
	}
	public Set getChildern() {
		return childern;
	}
	public void setChildern(Set childern) {
		this.childern = childern;
	}
	
	
}
