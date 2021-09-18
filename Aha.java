package testaroo;

import java.util.Arrays;

public class Aha {
	
	private static final int MISSING_VALUE = -999;
	private String title;
	private int ISBN;
	private Integer[] values;

	public Aha(String title, int iSBN, Integer[] values) {
		this.title = title;
		setISBN(iSBN);
		this.values = values;
	}
	
	public Aha() {
		//this("aha", 9, new Integer[10]);
		this.title = "what";
		this.ISBN = 9;
		this.values = new Integer[999];
		System.out.println("in the no-args constructor");
		
	}

	@Override
	public String toString() {
		return "Aha [title=" + title + ", ISBN=" + ISBN + ", values=" + Arrays.toString(values) + "]";
	}

	public String getTitle() {
		return title.toUpperCase();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		if ((iSBN > 1_000_000) && (iSBN < 9_000_000)) {
			ISBN = iSBN;
		}
		else {
			ISBN = MISSING_VALUE;
		}
		
	}

	public Integer[] getValues() {
		return values;
	}

	public void setValues(Integer[] values) {
		this.values = values;
	}
	
	public static void main(String[] args) {
		// TODO create main method
		String title = "Things they don't write about in books about Java";
		int ISBN = 2334;
		Integer[] values = {1, 2, 3};
		
		Aha aha = new Aha(title, ISBN, values);
		
		System.out.println(aha.toString());
		
	}
}
