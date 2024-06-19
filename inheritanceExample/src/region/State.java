package region;

public class State  extends Country{
	private String stname;

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}
 
	public String toString() {
		return "State [stname=" + stname + "]";
	}
	

}
