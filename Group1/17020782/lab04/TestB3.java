import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestB3 {

	@Test
	void test() {
		String i=GTLN.BMI(70, 1.7) ;
		assertEquals("Thua can",i);	
	}
	

	@Test
	void test1() {
		String i=GTLN.BMI(80, 1.7) ;
		assertEquals("Thua can",i);	
	}
	

	@Test
	void test2() {
		String i=GTLN.BMI(110, 1.9) ;
		assertEquals("Beo phi",i);	
	}
	
	@Test
	void test3() {
		String i=GTLN.BMI(50, 1.75) ;
		assertEquals("Thieu can",i);	
	}
	

	@Test
	void test4() {
		String i=GTLN.BMI(80, 1.62) ;
		assertEquals("Binh thuong",i);	
	}
	
}
