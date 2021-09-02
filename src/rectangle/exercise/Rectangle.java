package rectangle.exercise;
/**Fazer um programa para ler as medidas da base
 * e altura de um retângulo
 * @author joao
 */

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		calculateRectangle();	

	}
	
	public static void calculateRectangle(){
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		//Declando variáveis
		double base, altura, area, perimetro, diagonal;
		
		//Entrada dos dados
		System.out.print("Base do Retangulo: ");
		base = entrada.nextDouble();
		System.out.print("Altura do Retangulo: ");
		altura = entrada.nextDouble();
		
		area = base * altura; //calculo da base
		perimetro = 2 * (base + altura); //calculo do perimetro
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0)); //calculo diagonal
		
		System.out.println("ÁREA: " + String.format("%.4f", area));
		System.out.println("PERIMETRO: " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL: " + String.format("%.4f", diagonal));	
	}

}
