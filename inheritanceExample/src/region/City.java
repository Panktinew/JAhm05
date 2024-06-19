package region;

public class City extends State  {
	  private String city_name;

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	@Override
	public String toString() {
		return "Country = " + getCname() + " state = " + getStname()+ "  City " + city_name ;
	}
	  

}
