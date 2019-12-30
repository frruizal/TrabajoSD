
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Cliente{
	public static void main (String [] args) {
		Socket cliente=null;
		DataInputStream dis=null;
		PrintStream ps=null;
		
		try {
			cliente=new Socket("localhost",89);
			dis=new DataInputStream(cliente.getInputStream()); //Para leer lo que envie el servidor.
			ps=new PrintStream(cliente.getOutputStream()); //Enviamos informacion al servidor.
			
			DataInputStream entrada= new DataInputStream(System.in);
			int i=1;
			while(i<3) {
			System.out.println("Introduce el nombre de la carta numero " + i + " a valorar: "); 
			String nombre =entrada.readLine(); 
		
			System.out.println("Introduce la valoracion de: " + nombre); 
			String valoracion =entrada.readLine();
			
			System.out.println("Introduce el ritmo de: " + nombre); 
			String ritmo =entrada.readLine();
			
			System.out.println("Introduce el tiro de: " + nombre); 
			String tiro =entrada.readLine();
			
			System.out.println("Introduce el pase de: " + nombre); 
			String pase =entrada.readLine();
			
			System.out.println("Introduce el regate de: " + nombre); 
			String regate =entrada.readLine();
			
			System.out.println("Introduce la defensa de: " + nombre); 
			String defensa =entrada.readLine();
		
			System.out.println("Introduce el fisico de: " + nombre); 
			String fisico =entrada.readLine();
		
			ps.println(nombre+ " "+valoracion+" "+ritmo+" "+tiro+" "+pase+" "+regate+" "+defensa+" "+fisico);
			ps.flush();
			i++;
		}
			System.out.println(dis.readLine());
			String mejor=dis.readLine();
			String [] comp = mejor.split(" ");
			Carta c=new Carta(comp[0],comp[1],comp[2],comp[3],comp[4],comp[5],comp[6],comp[7]);
			System.out.println("----"+c.getNombre() + "----\n" +"valoracion: " +c.getValoracion()+ "\n"  +"ritmo: " +c.getRitmo()+ "\n"  +"tiro: " +c.getTiro()+ "\n"  +"pase: " +c.getPase()+ "\n" + "regate: " +c.getRegate()+ "\n" + "defensa: " +c.getDefensa()+ "\n"+ "fisico: " +c.getFisico());
			
			Interfaz interfaz =new Interfaz(c);
			interfaz.mostrarInterfaz();
			cliente.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				if(cliente!=null) {
					cliente.close();
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}}

