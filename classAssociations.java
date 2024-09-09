class Employee{

    private String name;
    private int dept;
    private double salary;

    public Employee(){
        name = "None";
        dept = -1;
        salary = 0.0;
    }

    public Employee(String name, int dept, double salary){
        setInfo(name, dept, salary);
    }

    public void setInfo(String name, int dept, double salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getDept(){
        return dept;
    }

    public void display(){
        System.out.println("Name: "+ name + " Department: " + dept + " Salary: " + salary);
    }

    public double computeBonus(){
        if (dept < 1000){
            return salary*0.01;
        }
        else{
            return salary*0.05;
        }
    }

}

class Company{
    public void addEmployee(Employee e)
	{
		employees[size] = e;
		size++;
	}

	public Employee getEmployee(String name)
	{
		boolean	found = false;
		int		i = 0;

		while (!found && i < size)
			if (employees[i].getName().equals(name))
				found = true;
			else
				i = i + 1;

		if (found)
			return employees[i];
		else
			return null;
	}

	public void displayAll()
	{
		for (int i=0; i < size; i++)
			employees[i].display();
	}
	
	public double totalBonus()
	{
		double total = 0.0;
		for (int i=0; i < size; i++)
			total = total + employees[i].computeBonus();

		return total;
	}

	private Employee employees[] = new Employee[10];
	private int size = 0;
}


public class classAssociations {
    public static void main(String[] args) {
        
        Company acme = new Company();

		Employee e1 = new Employee("Joe", 400, 10000.0);
		acme.addEmployee(e1);
		Employee e2 = new Employee("Bill", 600, 20000.0);
		acme.addEmployee(e2);
		acme.addEmployee(new Employee("Ann", 500, 30000.0));
		acme.addEmployee(new Employee("Sue", 700, 40000.0));

		acme.displayAll();
		System.out.println("Bonus cost is $" + acme.totalBonus());

		System.out.println();
		Employee temp = acme.getEmployee("Ann");
		temp.display();
		System.out.println(temp.getName() + " has a bonus of " + temp.computeBonus());
    }
}
