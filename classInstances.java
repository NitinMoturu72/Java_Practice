class employee{
    private String name;
    private int dept;
    private double salary;

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

public class classInstances{

public static void main(String[] args) {
    employee emp = new employee();
    emp.setInfo("Bob", 1000, 20000.0);
	emp.display();
	System.out.println(emp.computeBonus());


    employee emps[] = new employee[3];
    for(int i = 0; i < emps.length; i++){
        emps[i] = new employee();
    }

    emps[0].setInfo("Joe", 400, 10000.0);
    emps[1].setInfo("Sue", 1400, 20000.0);
    emps[2].setInfo("Ann", 500, 30000.0);


    for (int i = 0; i < emps.length; i++)
			emps[i].display();

    for (int i = 0; i < emps.length; i++)
        System.out.println(emps[i].computeBonus());
}
}