package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import main.Valor;

public class ValorTest {

	@Test
	public void TestIns() {
		Valor v = new Valor();
		boolean flag;
		int val = 10;
	   
		flag = v.ins(val);
		
		assertEquals(flag, true);
		
	}
	
	@Test
	public void TestDel() {
		Valor v = new Valor();
		v.ins(15);
		
		assertEquals(v.del(0), 15);
	}
	
	@Test
	public void TestList() {
		Valor v = new Valor();
		v.ins(15);
		v.ins(15);
		v.ins(15);
		
		assertEquals(v.size(), 3);
		
		
	}
	
	
}
