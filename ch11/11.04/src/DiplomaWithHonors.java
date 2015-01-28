/**
 * Represents a diploma in a course with honors
 * @author manny
 * @version 1/28/2015
 */
public class DiplomaWithHonors extends Diploma {
	public DiplomaWithHonors(String name, String course) {
		super(name, course);	//calling Diploma's constructor
	}
	
	public String toString() {
		return super.toString() + "\n       *** with honors ***";
	}
}
