package edu.iiitb.mergesort;

/**
 * 
 * This implements the merge sort sorting algorithm for sorting of int values.
 */
public class MergeSort extends Sort {

	public MergeSort() {
		super();
	}

	public MergeSort(int capacity) {
		super(capacity);
	}

	public MergeSort(int[] data) {
		super(data);
	}

	/**
	 * This is the method that is to be tested and will sort the int values.
	 */
	@Override
	public void sort() {
		this.data = mergesort(this.data, 0, this.currentSize);

	}

	private int[] mergesort(int[] a, int left, int right) {
		int[] res = a;
		if (right > left + 1) {
			int mid = (left + right) / 2;
			mergesort(a, left, mid);
			mergesort(a, mid, right);
			res = merge(a, left, right, mid);
			a = copyNewValues(a, res, left, right);
		}

		return res;
	}

	private int[] merge(int[] a, int left, int right, int mid) {
		int k = 0, i = left, j = mid;
		int[] b = new int[right - left];
		// System.out.println(left + mid + right);
		while (i < mid && j < right) {
			if (a[i] <= a[j]) {
				b[k++] = a[i++];
			} else {
				b[k++] = a[j++];
			}
		}

		if (i == mid) {
			for (; j < right; j++) {
				b[k++] = a[j];
			}
		} else {
			for (; i < mid; i++) {
				b[k++] = a[i];
			}
		}

		return b;
	}

	private int[] copyNewValues(int[] a, int[] b, int left, int right) {
		for (int i = 0; i < b.length; i++) {
			a[left + i] = b[i];
		}
		return a;
	}

}
