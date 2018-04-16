package luchadoresJaponeses;

public class Luchador {

	private double altura ;
	private double peso ;
	
	public Luchador(double altura , double peso){
		
		this.altura = altura ;
		this.peso = peso ;
	}
	
	public boolean Domina(Luchador l){
		
		if(this.peso > l.peso && this.altura > l.altura)
			return true ;
		
		if(this.peso == l.peso && this.altura > l.altura)
			return true ;
		
		if(this.altura == l.altura && this.peso > l.peso)
			return true ;
		
		return false ;
		
	}
}
