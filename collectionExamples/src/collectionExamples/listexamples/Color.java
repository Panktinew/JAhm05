package collectionExamples.listexamples;

import java.util.Comparator;

public class Color  {
	
	private int color_no;
	private String Color_Name;
	
	
	public Color(int color_no, String color_Name) {
		 
		this.color_no = color_no;
		Color_Name = color_Name;
	}
	public int getColor_no() {
		return color_no;
	}
	public void setColor_no(int color_no) {
		this.color_no = color_no;
	}
	public String getColor_Name() {
		return Color_Name;
	}
	public void setColor_Name(String color_Name) {
		Color_Name = color_Name;
	}
	@Override
	public String toString() {
		return "Color [color_no=" + color_no + ", Color_Name=" + Color_Name + "]";
	}
	
	
    	
    }
}
