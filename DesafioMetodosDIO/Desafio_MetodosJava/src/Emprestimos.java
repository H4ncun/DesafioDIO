
public class Emprestimos {
	
	private static double valorFinal(double taxa, double valor) {
		
		double valorFinal = valor + (valor * taxa);
		
		return valorFinal;
		}
	

	public static void calculaEmprestimo(double valor, int parcelas) {
		
			
		switch(parcelas) {
		
		case 1:
			
			System.out.print("\n Valor a ser pago é: " + valor + "\n");
			
			break;
		
		case 2:
			
			double taxa2 = 0.50;		
					
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa2, valor) + "\n");
			
			break;
		
		case 3:
			
			double taxa3 = 1.00;						
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa3, valor) + "\n");
			
			break;
			
		case 4:
			
			double taxa4 = 1.50;					
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa4, valor)+ "\n");
			
			break;
		
		case 5:
			
			double taxa5 = 2.00;					
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa5, valor) + "\n");
			
			break;
			
		case 6:
			
			double taxa6 = 2.50;			
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa6, valor) + "\n");
			
			break;
			
		case 7:
			
			double taxa7 = 3.00;					
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa7, valor) + "\n");
			
			break;
			
		case 8:
			
			double taxa8 = 3.50;				
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa8, valor) + "\n");
			
			break;
			
		case 9:
			
			double taxa9 = 4.00;					
			
			System.out.print("\n Valor a ser pago é: " + valorFinal(taxa9, valor)+ "\n");
			
			break;
		
		default:
			
			System.out.print("\n Numero máximo de parcelas são 9 \n");
			
		}

	}
}
