package clases;

public class Subhilo extends Thread{

	int n;

	public Subhilo(int n){
		System.out.println("Creando un subhilo del hilo "+n);
		this.n = n;
	}

	@Override
	public void run(){
		
		for (int i = 1; i<11; i++){
			System.out.println(i+"-SubHilo de "+this.n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Finalizando el subhilo de " + this.n);
	}
}
