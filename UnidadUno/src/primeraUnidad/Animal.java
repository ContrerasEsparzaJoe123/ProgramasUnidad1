package primeraUnidad;

public class Animal {
	public String color;
	public int patas;
	
	public Animal() {
	this.color="Cafe";
	this.patas=4;
	}
	public Animal (String color, int patas){
		this.color=color;
	    this.patas=patas;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println("hola mundo...");
	}

}
