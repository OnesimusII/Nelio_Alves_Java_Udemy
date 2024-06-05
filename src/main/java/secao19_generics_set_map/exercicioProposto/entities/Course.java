package secao19_generics_set_map.exercicioProposto.entities;

import java.util.HashSet;
import java.util.Set;
import secao19_generics_set_map.exercicioProposto.enums.CourseTypes;

public class Course
{
	private CourseTypes courseType;
	private Set<Student> students = new HashSet<>();

	public Course(CourseTypes courseType)
	{
		this.courseType = courseType;
	}

	public CourseTypes getCourseType()
	{
		return courseType;
	}

	public Set<Student> getStudents()
	{
		return students;
	}

	public void addStudent(int id)
	{
		this.students.add(new Student(id));
	}
}
