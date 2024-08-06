package bean;

public class Regular_employee extends Employee {
private float salary;
private int bonus;
public float getSalary() {
	return salary;
}
public Regular_employee(int id, String name, float salary, int bonus) {
	super(id, name);
	this.salary = salary;
	this.bonus = bonus;
}
@Override
public String toString() {
	return "Regular_employee [salary=" + salary + ", bonus=" + bonus + "]";
}
public void setSalary(float salary) {
	this.salary = salary;
}

public Regular_employee( ) {
	super();
}
public Regular_employee(int id, String name) {
	super(id, name);
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
}
