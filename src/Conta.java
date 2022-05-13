public class Conta{
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Operação concluida");
			return true;
		} else {
			System.out.println("Operação não concluida");
			return false;
		}
	}
	public void transfere(double valor, Conta destino) {
		saca(valor);
		destino.deposita(valor);
		
		}
	public double getSaldo() {
		return this.saldo;
	}
	}

