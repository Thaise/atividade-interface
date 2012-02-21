
public class TestaCalculaveis {

	public static void main(String[] args) {
		AreaCalculavel area = new Retangulo(3,2);
		AreaCalculavel area2 = new Quadrado(3);
		AreaCalculavel area3 = new Circulo(2);
		
		System.out.println("Área Retângulo: " + area.calculaArea());
		System.out.println("Área Quadrado: " + area2.calculaArea());
		System.out.println("Área Círculo: " + area3.calculaArea());

	}

}
