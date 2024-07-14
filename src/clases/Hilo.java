package clases;

public class Hilo extends Thread{

	int n;
	String nombre;

	public Hilo(int n){
		this.n = n;
		System.out.println("Creando el hilo " + n);
		Subhilo subhilo1 = new Subhilo("primero", n);
		Subhilo subhilo2 = new Subhilo("segundo", n);

		subhilo1.start();
		subhilo2.start();
	}

	@Override
	public void run(){
		
		for (int i = 1; i<11; i++){
			System.out.println(i+"-Hilo "+this.n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finalizando el hilo " + this.n);
	}
}
