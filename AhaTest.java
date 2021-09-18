package testaroo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AhaTest {

	@Test
	void testAha() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTitle() {
		String title = "Things they don't write about in books about Java";
		int ISBN = 2334;
		Integer[] values = {1, 2, 3};
		Aha aha = new Aha(title, ISBN, values);
		
		//in my virtual spec, title has to be all caps when returned
		String expected = title.toUpperCase();
		String str = aha.getTitle();
		assertEquals(expected, aha.getTitle());
	}

	@Test
	void testSetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetISBN() {
		fail("Not yet implemented");
	}

	@Test
	void testSetISBN() {
		// ISBN has to be bigger than 1_000_000
		// and less than 9_000_000
		String title = "Things they don't write about in books about Java";
		int ISBN = 2334;
		Integer[] values = {1, 2, 3};
		Aha aha = new Aha(title, ISBN, values);
		
		int isbn = aha.getISBN();
		assertEquals(-999, isbn);
		int nextISBN = 2_000_000;
		aha.setISBN(nextISBN);
		isbn = aha.getISBN();
		assertTrue((isbn > 1_000_000) && (isbn < 9_000_000));
		
	}

	@Test
	void testGetValues() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValues() {
		fail("Not yet implemented");
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

}
