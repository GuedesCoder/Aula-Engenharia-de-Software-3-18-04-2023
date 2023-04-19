package Lanchonete;

public class Combo extends Produto {

	private Burguer burguer = new Burguer();
	private Sobremesa sobremesa = new Sobremesa();
	private Bebida bebida = new Bebida();

	public void CriarCombo(int tipo) {

		switch (tipo) {
		case 1:
			System.out.println("\nO Combo selecionado foi: Combo Master.\n");
			burguer.setDescricao("Hamburguer de Carne Bovina com Batata Frita Grande");
			burguer.setGramas(300);
			burguer.setPreco(20.99);
			bebida.setDescricao("Coca-Cola");
			bebida.setMl(500);
			bebida.setPreco(7.49);
			sobremesa.setDescricao("Petit Gateau");
			sobremesa.setTamanho("Grande");
			sobremesa.setPreco(14.99);
			
			break;
		case 2:
			System.out.println("\nO Combo selecionado foi: Combo Super.\n");
			burguer.setDescricao("Hamburguer de Frango com Batata Frita Média");
			burguer.setPreco(12.99);
			burguer.setGramas(250);
			bebida.setDescricao("Suco Del Vale");
			bebida.setMl(300);
			bebida.setPreco(5.49);
			sobremesa.setDescricao("Torta Banoffee");
			sobremesa.setTamanho("Pequena");
			sobremesa.setPreco(6.99);
			break;
		default:
			throw new IllegalArgumentException(
					"\r\nOpção Inválida: " + tipo + "\r\nApenas as opções 1 e 2 são válidas.");
		}
	}

	@Override
	public String toString() {
		return 	"Tipo do Burguer: " + burguer.getDescricao() + "\r\n" + 
				"Peso do Burger (gramas): " + burguer.getGramas() + "\r\n" + 
				"Preço do Burguer: " + burguer.getPreco() + "\r\n" + 
				"Tipo da Bebida: " + bebida.getDescricao() + "\r\n" +
				"Tamanho da Bebida (Ml): " + bebida.getMl() + "\r\n" + 
				"Preço da Bebida: " + bebida.getPreco() + "\r\n" + 
				"Tipo da sobremesa: " + sobremesa.getDescricao() + "\r\n" +
				"Tamanho da Sobremesa: " + sobremesa.getTamanho() + "\r\n" + 
				"Preço da sobremesa: " + sobremesa.getPreco() + "\r\n";
	}
}
