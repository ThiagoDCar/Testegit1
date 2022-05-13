
public class testaMetoddo {
	public static void main(String[] args) {
	Conta conta1 = new Conta();
	conta1.saldo = 100;
	conta1.deposita(50);
	conta1.saca(20);
	System.out.println(conta1.pegaSaldo());
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	contaDaMarcela.transfere(300, conta1);
	System.out.println(conta1.saldo);
	System.out.println(contaDaMarcela.saldo);
	}
	
}
