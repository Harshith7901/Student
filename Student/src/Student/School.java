package Student;

import java.util.List;

//	Many teachers,many students
//	Implements teachers and students
//	using an ArrayList

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

//	new school object is created
//	list of teachers in the school
//	list of student in the school
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

//	return the list of the teachers in the school
	public List<Teacher> getTeacher() {
		return teachers;
	}

//	Adds a teacher to the school
//	The teacher to be added
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

//	return the list of students in the school
	public List<Student> getStudent() {
		return students;
	}

//	Adds a student to the school
//	student the student to be added
	public void addStudent(Student student) {
		students.add(student);
	}

//	return total money earned by the school
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

//	adds the total money earned by the school
//	MoneyEarned money that is supposed to be added.
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

//	returns the total money spent by the school
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

//	update the money that is spent by the school which
//	is the salary given by the school to its teachers
//	MoneySpent the money spent by school
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}

}