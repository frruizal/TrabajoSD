import java.io.IOException;
import java.io.*;
import java.net.*;

public class Servidor {
	public static void main(String [] args) {
		ServerSocket ss=null;
		Socket s=null;
		try {
			ss=new ServerSocket(89);
			System.out.println("Servidor iniciado:");
			while(true) {
				s=ss.accept();
				System.out.println("Se acaba de conectar un cliente");
				DataInputStream dis=new DataInputStream(s.getInputStream());
				//BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				PrintStream ps = new PrintStream(s.getOutputStream()); //Para enviar mensajes al cliente
				
				String linea = dis.readLine();
				String [] comp = linea.split(" ");
				Carta c=new Carta(comp[0],comp[1],comp[2],comp[3],comp[4],comp[5],comp[6],comp[7]);
				System.out.println(c.getNombre() + " tiene de estadisticas:\n" +"valoracion: " +c.getValoracion()+ "\n"  +"ritmo: " +c.getRitmo()+ "\n"  +"tiro: " +c.getTiro()+ "\n"  +"pase: " +c.getPase()+ "\n" + "regate: " +c.getRegate()+ "\n" + "defensa: " +c.getDefensa()+ "\n"+ "fisico: " +c.getFisico());
				int total=Integer.parseInt(c.getValoracion())+Integer.parseInt(c.getRitmo())+Integer.parseInt(c.getTiro())+Integer.parseInt(c.getPase())+Integer.parseInt(c.getRegate())+Integer.parseInt(c.getDefensa())+Integer.parseInt(c.getFisico());
				System.out.println("-----------------------------");
				//System.out.println("LA SUMA DE TODAS LAS ESTADISTICAS DE "+ c.getNombre() +" es " + total);
				
				
				String linea2 = dis.readLine();
				String [] comp2 = linea2.split(" ");
				Carta c2=new Carta(comp2[0],comp2[1],comp2[2],comp2[3],comp2[4],comp2[5],comp2[6],comp2[7]);
				System.out.println(c2.getNombre() + " tiene de estadisticas:\n" +"valoracion: " +c2.getValoracion()+ "\n"  +"ritmo: " +c2.getRitmo()+ "\n"  +"tiro: " +c2.getTiro()+ "\n"  +"pase: " +c2.getPase()+ "\n" + "regate: " +c2.getRegate()+ "\n" + "defensa: " +c2.getDefensa()+ "\n"+ "fisico: " +c2.getFisico());

				int total2=Integer.parseInt(c2.getValoracion())+Integer.parseInt(c2.getRitmo())+Integer.parseInt(c2.getTiro())+Integer.parseInt(c2.getPase())+Integer.parseInt(c2.getRegate())+Integer.parseInt(c2.getDefensa())+Integer.parseInt(c2.getFisico());
				//System.out.println("LA SUMA DE TODAS LAS ESTADISTICAS DE "+ c2.getNombre() +" es " + total2);
				
				if (total>total2) {
					ps.println("EN EL FIFA 20 LA CARTA CON MEJORES ESTADISTICAS DE LAS QUE HAS COMPARADO ES: " );
					ps.println(c.getNombre()+" "+c.getValoracion()+" "+c.getRitmo()+" "+c.getTiro()+" "+c.getPase()+" "+c.getRegate()+" "+c.getDefensa()+" "+c.getFisico());
				}
				else {
					ps.println("EN EL FIFA 20 LA CARTA CON MEJORES ESTADISTICAS DE LAS QUE HAS COMPARADO ES: " );
					ps.println(c2.getNombre()+" "+c2.getValoracion()+" "+c2.getRitmo()+" "+c2.getTiro()+" "+c2.getPase()+" "+c2.getRegate()+" "+c2.getDefensa()+" "+c2.getFisico());
				}
				s.close();
				System.out.println("El cliente se ha desconectado:");
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				if(ss!=null) {
					ss.close();
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
				
	}
}
