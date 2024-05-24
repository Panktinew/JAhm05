package tnsif.region.countrystatepack;

public class City {
	
	private String cname;
	public City()
	{
		
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public City(String cname) {
		 
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "City [cname=" + cname + "]";
	}
	
	

}
