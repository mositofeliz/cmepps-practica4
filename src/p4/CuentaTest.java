package p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	Cuenta cta = new Cuenta(12345,"", 50.0);
	Cuenta cta2 = new Cuenta(67890,"", 0.0);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
	}
	
	@Test
	public void testSuma() { 
		assertEquals(5, Matematicas.suma(2,3)); 
		} 
	
	public void testSaldo1() {
		cta.retirar(200.0);
		cta2.retirar(350.0);
		cta.ingresar(100.0);
		cta2.retirar(200.0);
		cta2.retirar(150.0);
		cta.retirar(200.0);
		cta2.ingresar(50.0);
		cta2.retirar(100.0);
		
		
		assertEquals(-250.0, cta.getSaldo());
		assertEquals(-450.0, cta2.getSaldo());
	}
	 

}
