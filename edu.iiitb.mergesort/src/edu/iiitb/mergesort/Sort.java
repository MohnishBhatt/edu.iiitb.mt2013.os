package edu.iiitb.mergesort;

import java.util.Arrays;

/**
 * This is represents the abstract sort class
 * 
 */
public abstract class Sort {

	protected int currentSize;

	protected int[] data;

	private static int DEFAULT_SIZE = 5;

	private static int INITIAL_SIZE = 0;

	public Sort() {
		this.currentSize = INITIAL_SIZE;
		this.data = new int[DEFAULT_SIZE];
	}

	public Sort(int capacity) {
		this.currentSize = INITIAL_SIZE;
		this.data = new int[capacity];
	}

	public Sort(int[] data) {
		this.currentSize = data.length;
		this.data = Arrays.copyOf(data, this.currentSize);
		// Arrays.
	}

	public boolean addData(int val) {
		boolean isAdded = false;
		if (this.currentSize + 1 <= this.data.length) {
			this.data[this.currentSize] = val;
			this.currentSize++;
			isAdded = true;
		}
		return isAdded;
	}

	public abstract void sort();

	public void printData() {
		for (int i = 0; i < this.data.length; i++) {
			System.out.println(this.data[i]);
		}
	}

	public String getDataString() {
		return Arrays.toString(data);
	}

	/**
	 * @return the data
	 */
	public int[] getData() {
		return data;
	}
}
