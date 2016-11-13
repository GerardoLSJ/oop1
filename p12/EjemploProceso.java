public class EjemploProceso extends Thread{

public static void main(String[] args) {

	System.out.println("Creando thread");
	//Thread t = new Thread();
	EjemploProceso t = new EjemploProceso();

	System.out.println("Iniciando thread");
	t.start();
}


public void run(){
	System.out.println("Ejecutando metodo run");
}

}