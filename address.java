import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Address{
	private String street;
	private String city;
	private String pinCode;
}
@Getter
@Setter
@AllArgsConstructor
@ToString
class Person{
	private String name;
	private int age;
	private Address address; //Person HAS-A relationship with address
}
class Detail{
	public static void main(String[]args){
		Address address= new Address("Salkia","Howrah","711106");//Address object
		Person person= new Person("Aditya",20,address);//Person object with address
	System.out.println(person);
	}
}
		
	