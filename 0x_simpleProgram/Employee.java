public class Employee implements Comparable<Employee> {
	private long id;
	private String name;
	private double salary;
	public Employee(long id, String name, double salary){
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		//return String.format("Employee %1$: %2$ with salary  %3$", id , name , salary);
		return String.format("Employee %1$d: %2$s have salary  %3$,7.1f", id, name, salary );
	}
	public void incrementSalary(double salary) {
		this.salary += 	salary;
	}
	@Override 
	public int compareTo(Employee other) {
		if (this.getSalary() == other.getSalary()) {
			return 0;
		}
		if (this.getSalary() > other.getSalary()) {
			return 1;
		}
		return -1;
	}

}