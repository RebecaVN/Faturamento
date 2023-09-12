
public class Faturamento {
	
	public static void main (String [] args) {
		
		double precoSucoDeLaranja = 10.00;
		double precoSucoDeUva = 8.00;
		double precoSucoDeCaju = 6.45;
	
		
		int unidadeSucoDeLaranja = 200;
		int unidadeSucoDeUva = 30;
		int unidadeSucoDeCaju = 150;
		
		double totalDeVendas = unidadeSucoDeLaranja * precoSucoDeLaranja + precoSucoDeUva * unidadeSucoDeUva + precoSucoDeCaju * unidadeSucoDeCaju;
		
		
		System.out.println("Relat�rio de Faturamento: ");
		System.out.println("                          ");
		System.out.println("Produto/Pre�o:");
		System.out.println("Pre�o do suco de Laranja: R$" + precoSucoDeLaranja);
		System.out.println("Pre�o do suco de Uva: R$" + precoSucoDeUva);
		System.out.println("Pre�o do suco de Caj�: R$" + precoSucoDeCaju);
		System.out.println("-------------------------------------");
		System.out.println("Faturamento:");
		System.out.println(unidadeSucoDeLaranja + " unidades de suco de Laranja: R$" + precoSucoDeLaranja * unidadeSucoDeLaranja);
		System.out.println( unidadeSucoDeUva + " unidades de suco de Uva: R$" + precoSucoDeUva * unidadeSucoDeUva);
		System.out.println(unidadeSucoDeCaju + " unidades de suco de caj�: R$" + precoSucoDeCaju * unidadeSucoDeCaju);
		System.out.println("                                       ");
		System.out.println("Total de vendas: R$" + totalDeVendas);
		
	
	}
		
}
