public class EjemploProceso2 extends Thread
{
public static void main( String args[] )
{
// Para crear un Thread se debe extender a Thread
// y crear objetos de tipo EjemploProceso4
System.out.println( "Creando thread" );
EjemploProceso2 t1 = new EjemploProceso2();
EjemploProceso2 t2 = new EjemploProceso2();
t1.setName( "proceso1" );
t2.setName( "proceso2" );
System.out.println( "Iniciando thread" );
t1.start();
t2.start();
}
public void run()
{

System.out.println( "Ejecutando thread" );

if(Thread.currentThread().getName().equals("proceso1")){
for(int i=0; i <= 10; i++ )
{
System.out.println( Thread.currentThread().getName() + ":" + i);
}
}
else{
for(int j=10; j >=0; j--)
{
System.out.println( Thread.currentThread().getName() + ":" + j);
}
}


}
}