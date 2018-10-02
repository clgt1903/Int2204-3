import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestLabs04 {

	@Test
	void test() {
	
	int i=GTLN.max(3, 4) ;
	assertEquals(3,i);	
	}

	@Test
	void test1() {
	
	int i=GTLN.max(2, 4) ;
	assertEquals(4,i);	
	}
	@Test
	void test2() {
	
	int i=GTLN.max(2, 4) ;
	assertEquals(6,i);	
	}
	@Test
	void test3() {
	
	int i=GTLN.max(5, 6) ;
	assertEquals(6,i);	
	}
	@Test
	void test4() {
	
	int i=GTLN.max(10, 4) ;
	assertEquals(4,i);	
	}
	@Test
	void test5() {
	
	int i=GTLN.max(-5, 0) ;
	assertEquals(0,i);	
	}

}
