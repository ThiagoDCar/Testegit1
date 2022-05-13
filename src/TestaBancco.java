
public class TestaBancco {
	public static void main(String[] args) {
		Cliente thiago = new Cliente();
		thiago.nome = "Thiago Cardoso";
		thiago.CPF = "222.222.22-22";
		thiago.profissao ="programador";
		
		Conta contaDoThiago = new Conta();
		contaDoThiago.titular = thiago;
		System.out.println(contaDoThiago.titular.nome);
		System.out.println("O CPF EH: " + contaDoThiago.titular.profissao);
		
		Conta contaDoDrews = new Conta();
		contaDoThiago.transfere(3000, contaDoDrews);
		System.out.println("O saldo de Drews e:" + contaDoDrews.pegaSaldo());
		System.out.println("O SALDO DO PAI: " + contaDoThiago.pegaSaldo());
		
	}

}
