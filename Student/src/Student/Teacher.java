package Student;

//This class is Responsible for keeping the track of teacher's name, id, salary 

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

//	Create a new Teacher object
//	id for the teacher
//	name of the teacher
//	salary of the teacher

//	---------------------Setters---------------------------
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}

//	---------------------Getters----------------------------
//	return the id of the teacher
	public int getId() {
		return id;
	}

//	return name of the teacher
	public String getName() {
		return name;
	}

//	return the salary of the teacher
	public int getSalary() {
		return salary;
	}

//	Set the salary
	public void setsalary(int salary) {
		this.salary = salary;
	}

//	adds to salaryEarned
//	removes from the total money earned by the school
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the Teacher: " + name + " Total salary earned so far $" + salaryEarned;
	}

}