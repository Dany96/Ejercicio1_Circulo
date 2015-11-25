
public class Circulo {

	private double radio;

	public Circulo(){
		this.radio=1;
	}
	
	public Circulo(double radioparam){
		this.radio=radioparam;
	}
	
	public void getRadio(double radioparam){
		this.radio=radioparam;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double getArea(){
		return Math.PI*radio*radio;		
	}
	
					   }
