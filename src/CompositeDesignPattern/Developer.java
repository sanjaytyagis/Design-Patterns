package CompositeDesignPattern;

public class Developer implements Employee{

	private String name;
    private long empId;
    private String position;
      
    public Developer(long empId, String name, String position)
    {
        // Assign the Employee id,
        // name and the position
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
	
	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println(empId+" " +name+ " " + position );
	}

}
