

public class Carta{
	private String nombre;
	private String valoracion;
	private String ritmo;
	private String tiro;
	private String pase;
	private String regate;
	private String defensa;
	private String fisico;
	
	public Carta(String nom,String val,String ri,String ti, String p, String re,String de,String fi){
		this.nombre=nom;
		this.valoracion=val;
		this.ritmo=ri;
		this.tiro=ti;
		this.pase=p;
		this.regate=re;
		this.defensa=de;
		this.fisico=fi;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nom){
		this.nombre=nom;
	}
	public String getValoracion(){
		return this.valoracion;
	}
	public void setValoracion(String val){
		this.valoracion=val;
	}
	public String getRitmo(){
		return this.ritmo;
	}
	public void setRitmo(String ri){
		this.ritmo=ri;
	}
	public String getTiro(){
		return this.tiro;
	}
	public void setTiro(String ti){
		this.tiro=ti;
	}
	public String getPase(){
		return this.pase;
	}
	public void setPase(String pa){
		this.pase=pa;
	}
	public String getRegate(){
		return this.regate;
	}
	public void setRegate(String re){
		this.regate=re;
	}
	public String getDefensa(){
		return this.defensa;
	}
	public void setDefensa(String de){
		this.defensa=de;
	}
	public String getFisico(){
		return this.fisico;
	}
	public void setFisico(String fi){
		this.fisico=fi;
	}
	//public int getTotal(){
	//	return (this.getRitmo()+ this.getTiro() + this.getPase()+ this.getRegate() + this.getDefensa()+this.getFisico());
	//}
	
	
}