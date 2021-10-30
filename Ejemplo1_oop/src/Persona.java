// Definicions de mi clase

public class Persona {
	/*
	 *Atributos de mi clase
	 * modificador tipo_de_dato nombreDelAtributo
	*/
	String nombre;
	int edad;
	char sexo;

	//Constructor por defecto
	//Modificador (Los constructores no definen un valor de retorno) 
	// Nombre de la clase (parametros)
	public Persona(String nombre, int edad, char sexo) {
		//System.out.println("Utilizando constructor que recibe 3 parametros");
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	/*public Persona() {
		System.out.println("Utilizando constructor que no recibe parametros");
	}*/
	
	/*Metodos
	 * modificador de retorno nombreDelMetodo(parametros)
	 */
	void respirar() {
		System.out.println("La persona " + nombre+" esta respirando ");
	}
	void nacer() {
		System.out.println("La persona " +nombre+" lleva "+edad+" años vivo" );
	}
	void morir() {
		System.out.println("La persona " +nombre+" murio a los "+edad+" años" );
	}
	
	// El metodo main define el punto de inicio de mi programa 
	public static void main(String[] args) {
		/*
		 * Persona = Tipo de dato
		 * p = nombre de mi referencia 
		 * new = Operador de java que me permite crear objetos 
		 * Persona() = Constructor 
		 */
		System.out.println("Ejecucion de Mauri");
		Persona p = new Persona("Mauri",21, 'M');
		p.respirar();
		p.nacer();
		p.morir();
		
		System.out.println("\nEjecucion de Sonia");
		Persona p1 = new Persona("Sonia",28,'F');
		p1.respirar();
		p1.nacer();
		p1.morir();
	}
}
