package clases;

public class Hilo extends Thread{

	int n;
	String nombre;
	Subhilo subhilo1;
	Subhilo subhilo2;

	public Hilo(int n){
		this.n = n;
		System.out.println("Creando el hilo " + n);
		subhilo1 = new Subhilo("primero", n);
		subhilo2 = new Subhilo("segundo", n);

	}

	public void arrancarSubhilos(){
		subhilo1.start();
		subhilo2.start();
	}

	@Override
	public void run(){
		
		for (int i = 1; i<=5; i++){
			System.out.println(i+"-Hilo "+this.n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finalizando el hilo " + this.n);
	}

    public Object getN() {
		System.out.println("[Hilo>getN] escrito desde Linux y corregido en Windows");
        return this.n;
    }
}
