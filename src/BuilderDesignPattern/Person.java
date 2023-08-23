package BuilderDesignPattern;

public class Person {

	private final String firstName;
    private final String lastName;
    private final String street;
    private final Integer age;
 
 
    public Person (String firstName,
                   String lastName,
                   String street,
                   Integer age) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.street = street;
       this.age = age;
    }
	public static void main(String[] args) {
		Person myPerson = new PersonBuilder()
                .setFirstName("Piotr")
                .setLastName("Gajek")
                .setAge(24)
                .build();
		System.out.println(myPerson.firstName);

	}

}
