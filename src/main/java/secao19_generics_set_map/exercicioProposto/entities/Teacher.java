package secao19_generics_set_map.exercicioProposto.entities;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Teacher
{
	private Set<Course> courses = new LinkedHashSet<>();

	public void addCourse(Course course)
	{
		this.courses.add(course);
	}

	public Set<Course> getCourses()
	{
		return courses;
	}
}
