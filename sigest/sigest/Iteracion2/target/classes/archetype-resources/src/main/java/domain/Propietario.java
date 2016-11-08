package domain;

public class Propietario extends Persona {
	int cod;
	
	public Propietario(String dni, String nombre, String apellidos, int cod) {
		super(dni, nombre, apellidos, cod);		
	}
	
	//Gets
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	//Sets
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
