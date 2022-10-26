package p4;

import java.util.List;

public class Cuenta {
	public String mNumero;
	public String nTitular;
	public Double saldo = 0.0;
	//public List <Movimiento> mMovimiento;
	
	public Cuenta(String numero, String titular, double saldoI) {
		super();
		this.mNumero=numero;
		this.nTitular=titular;
		this.saldo=saldoI;
	}
	
	public String getNumero() {
		return this.mNumero;
	}
	
	public String getTitular() {
		return this.nTitular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setnTitular(String nTitular) {
        this.nTitular = nTitular;
    }
	
	public void setSaldo(double saldo) {
        this.saldo = saldo;
	}
	
	
	
	public void ingresar(double x) {
		this.saldo = this.saldo + x;
	}
	
	
	public void retirar(double x) throws Exception {
		if(this.saldo - x < -500) {
            throw new Exception("Operacion no permitida");
        }
		
		this.saldo = this.saldo - x;
	}
}
