WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package relop;

import heap.HeapFile;
import index.HashIndex;
import global.SearchKey;
import global.RID;
import global.AttrOperator;
import global.AttrType;

public class HashJoin extends Iterator {
	
	public HashJoin(Iterator aIter1, Iterator aIter2, int aJoinCol1, int aJoinCol2){
		throw new UnsupportedOperationException("Not implemented");
	} 

	/**
	* Gives a one-line explanation of the iterator, repeats the call on any
	* child iterators, and increases the indent depth along the way.
	*/
	public void explain(int depth) {
	  throw new UnsupportedOperationException("Not implemented");
	}

	/**
	* Restarts the iterator, i.e. as if it were just constructed.
	*/
	public void restart() {
	  throw new UnsupportedOperationException("Not implemented");
	}

	/**
	* Returns true if the iterator is open; false otherwise.
	*/
	public boolean isOpen() {
	  throw new UnsupportedOperationException("Not implemented");
	}

	/**
	* Closes the iterator, releasing any resources (i.e. pinned pages).
	*/
	public void close() {
	  throw new UnsupportedOperationException("Not implemented");
	}

	/**
	* Returns true if there are more tuples, false otherwise.
	*/
	public boolean hasNext() {
	  throw new UnsupportedOperationException("Not implemented");
	}

	/**
	* Gets the next tuple in the iteration.
	* 
	* @throws IllegalStateException if no more tuples
	*/
	public Tuple getNext() {
	  throw new UnsupportedOperationException("Not implemented");
	}
} // end class HashJoin;
