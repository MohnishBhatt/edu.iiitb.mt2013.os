package org.iiitb.implementation;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HandyFunctions {

	// Sort & Merge Freelist nodes
	public void MergeList(List<FreeList> flList) {

		FreeList node1 = null;
		FreeList node2 = null;
		Iterator<FreeList> iterator = flList.iterator();
		
		while (iterator.hasNext()) {
			if (node1 == null) {
				node1 = iterator.next();
			} else {
				node2 = iterator.next();
			}
			if (node1 != null && node2 != null) {
				if (node1.endingAdd == node2.startingAdd) {
					node1.endingAdd = node2.endingAdd;
					node1.size = node1.size + node2.size;
					iterator.remove();
					node2 = null;
				}

				else {
						node1 = node2;
						node2 = null;
				}

			}
		}



	}

	public void SortList(List<FreeList> flList) {
		Collections.sort(flList);
	}
}
