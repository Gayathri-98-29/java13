package Java13;



	public class Employee01 {

	    private String name;
	    private int id;
	    private double salary;

	    public  Employee01( String name, int id, double salary){
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    public void printName(){
	        System.out.println("Employee name: " + name);
	    }

	    public void  printSalary(){
	        System.out.println("Employee Salary: " + salary);
	    }
	}
