package p4;

import java.util.List;

public class Cuenta {
	public int mNumero;
	public String Titular;
	public Double saldo = 0.0;
	public List <Movimiento> mMovimiento;
	
	public Cuenta() {
		
	}
	
	public int getNumero() {
		return this.mNumero;
	}
	
	public String getTitular() {
		return this.Titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Cuenta(int numero, String titular, double saldo) {
		this.mNumero=numero;
		this.Titular=titular;
		this.saldo=saldo;
	}
	
	
	
	public void ingresar(double x) {
		saldo = saldo + x;
	}
	
	
	public void retirar(double x) {
		saldo = saldo - x;
	}
}
