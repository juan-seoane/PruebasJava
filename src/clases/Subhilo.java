package clases;

public class Subhilo extends Thread{

	int n;
	String nombre;

	public Subhilo(String nom,int n){
		this.nombre = nom;
		this.n= n;
		System.out.println("Creando subhilo " + this.nombre + " del hilo " + this.n);

	}

	@Override
	public void run(){
		
		for (int i = 1; i<=5; i++){
			System.out.println(i+" - SubHilo " + this.nombre + " del hilo "+this.n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Finalizando el subhilo " + this.nombre + " del hilo " + this.n);
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getN(){
		return this.n;
	}
}
