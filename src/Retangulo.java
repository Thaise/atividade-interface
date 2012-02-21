
public class Retangulo implements AreaCalculavel{

	private int base;
	private int altura;
	
	public Retangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return this.base * this.altura;
	}
}
