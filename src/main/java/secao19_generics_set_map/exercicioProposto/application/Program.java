package secao19_generics_set_map.exercicioProposto.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import secao19_generics_set_map.exercicioProposto.entities.Course;
import secao19_generics_set_map.exercicioProposto.entities.Student;
import secao19_generics_set_map.exercicioProposto.entities.Teacher;
import secao19_generics_set_map.exercicioProposto.enums.CourseTypes;

public class Program
{
	/*
	Exercício proposto (Set)

	Em um portal de cursos online, cada usuário possui um código único, representado por
	um número inteiro.
	Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
	matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
	é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
	alunos repetidos em mais de um curso.
	O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
	Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
	quantidade total e alunos dele, conforme exemplo.
	 */

	public static void main(String[] args0)
	{
		Scanner sc = new Scanner(System.in);

		Teacher teacher = new Teacher();
		teacher.addCourse(new Course(CourseTypes.A));
		teacher.addCourse(new Course(CourseTypes.B));
		teacher.addCourse(new Course(CourseTypes.C));

		for (Course course : teacher.getCourses())
		{
			int studentsQuantity;
			if (course.getCourseType().equals(CourseTypes.A))
			{
				System.out.print("How many students for course A? ");
			}
			else if (course.getCourseType().equals(CourseTypes.B))
			{
				System.out.print("How many students for course B? ");
			}
			else
			{
				System.out.print("How many students for course C? ");
			}
			studentsQuantity = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < studentsQuantity; i++)
			{
				System.out.println(String.format("Digite o ID do %dº aluno do curso %s: ", i + 1,
					course.getCourseType()));
				course.addStudent((sc.nextInt()));
				sc.nextLine();
			}
			System.out.println();
		}

		Set<Student> students = new HashSet<>();

		for (Course course : teacher.getCourses())
		{
			Set<Student> courseStudents = course.getStudents();
			for (Student student : courseStudents)
			{
				students.add(student);
			}

		}

		System.out.println("Total students: " + students.size());

		sc.close();
	}
}
