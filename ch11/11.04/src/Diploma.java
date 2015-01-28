/**
 * Represents a person's diploma in a course
 * @author manny
 * @version 1/28/2015
 */
public class Diploma {
	private String name, course;	//holder's name and the course name
	
	/**
	 * Constructor that takes both names
	 * 
	 * @param name holder's name
	 * @param course course title
	 */
	public Diploma(String name, String course) {
		this.name = name;
		this.course = course;
	}
	
	public String toString() {
		return "This certifies that " + name +
				"\nhas completed a course in " + course;
	}
}