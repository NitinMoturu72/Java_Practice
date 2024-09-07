class employee{

    private String name;
    private int dept;
    private double salary;

    public employee(){
        name = "None";
        dept = -1;
        salary = 0.0;
    }

    public employee(String name, int dept, double salary){
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

class constructors {
    public static void main(String[] args) {
        
        employee emps[] = new employee[3];
        
        emps[0] = new employee();
        emps[1] = new employee("Jaane", 1400, 20000.0);
        emps[2] = new employee("Annt", 500, 30000.0);
    
    
        for (int i = 0; i < emps.length; i++)
                emps[i].display();
    
        for (int i = 0; i < emps.length; i++)
            System.out.println(emps[i].computeBonus());
    }
}
