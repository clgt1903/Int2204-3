import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestB2 {

	@Test
	void test() {
	int[] arr= {5,6,9,8,1,2,0,4,11,56};
	
	int i=GTLN.min(arr) ;
	assertEquals(0,i);	
	}
	
	@Test
	void test1() {
	int[] arr= {6,8,9,45,12,7,959,626,15,3,-6,-5,-32,-541,0};
	
	int i=GTLN.min(arr) ;
	assertEquals(-541,i);	
	}
	
	@Test
	void test2() {
	int[] arr= {-6,-8,6,9,5,-5,65,39};
	
	int i=GTLN.min(arr) ;
	assertEquals(0,i);	
	}
	
	@Test
	void test3() {
	int[] arr= {5,9,6,3,47,-8,5,9,-3,-1};
	
	int i=GTLN.min(arr) ;
	assertEquals(-8,i);	
	}
	
	@Test
	void test4() {
	int[] arr= {6,4,8,7,5,3,2,-5,-63,-8,-96};
	
	int i=GTLN.min(arr) ;
	assertEquals(-96,i);	
	}
}