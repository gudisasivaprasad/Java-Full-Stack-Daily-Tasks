/*Title :- Modeling Employee and Address Details 

Create a BLC class Address

Fields :-
------------
Implement a class with private fields for street and city.

Constructor :-
--------------
Provide a constructor to initialize these fields.

getter() & toString() method :-
-------------------------------
Implement getter methods and a toString() method to display the address.


Create another BLC class Person.


Fields :-
--------
Implement a class with private fields for name and an Address object.

Constructor :-
--------------
Provide a constructor to initialize name and address.

method getPersonDetails()
--------------------------
Implement a method to display the person's name and address.

Create an ELC class called Test

Implement a main method :-
---------------------------
-> Instantiate an Address object with sample data.
-> Instantiate a Person object using the Address object created earlier.
-> Print the person's details using the method in the Person class. */


public class Test {
	void main() {
		Address address = new Address("Ameerpet","Hyderabad");
		Person person = new Person("Aravindu",address);
		IO.println(person.getPersonDetais());
		
	}
	
}

class Address{
	private String street;
	private String city;
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "A street=" + street + ", city=" + city ;
	}
	
}

class Person{
	private String name;
	private Address address;
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getPersonDetais() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
}