package Student;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

//------------------------------------------------------------------		
//		To create a new student by initilizing.
//		Fees for every student is $30000.
//		Fees paid initially is 0.
//		id for the student unique
//		name of the student
//		grade of the student

	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;

	}

//		Not going to alter student's name, student's id.

//		Used to update the student's grade.
//		grade new grade of the student

	public void setGrade(int grade) {
		this.grade = grade;
	}

//		Keep adding the fees to payFees fiels.
//		Add the fees to the fees paid.
//		The school is going to receive the funds.

	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

//		return id of the student
	public int getId() {
		return id;
	}

//		return name of the student
	public String getName() {
		return name;
	}

//		return grade of the student
	public int getGrade() {
		return grade;
	}

//		return fees paid by the student
	public int getFeesPaid() {
		return feesPaid;
	}

//		return the total fees of the student
	public int getFeesTotal() {
		return feesTotal;
	}

//		returns the remaining fees
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nStudent's name: " + name + " Total fees paid so far $" + feesPaid;
	}

}