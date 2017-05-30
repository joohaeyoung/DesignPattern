import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList<T> implements Iterable<T> {
	private static class Node<T>{
		public T item;
		public Node<T> next = null;
	}
	private class LinkedListIterator implements ListIterator<T>{
		private Node<T> curr = head;
		private Node<T> prev = null;
		public boolean isIllegalState = true;
		@Override
		public boolean hasNext() {
			return curr!=null;
		}
		@Override
		public T next() {
			T item = curr.item;
			prev = curr;
			curr = curr.next;
			isIllegalState = false;
			return item;
		}

		@Override
		public boolean hasPrevious() {
			throw new UnsupportedOperationException();
		}

		@Override
		public T previous() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int nextIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int previousIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove(){
		}

		@Override
		public void set(T item) {
			if(isIllegalState) throw new IllegalStateException();
			prev.item = item;
		}

		@Override
		public void add(T item) {
			Node<T> newNode = new Node<>();
			newNode.item = item;
			if(prev==null){
				head = newNode;
			}
			else
				prev.next = newNode;
			newNode.next = curr;
			prev = newNode;
			++size;
			isIllegalState = true;
		}
	}
	public Node<T> head = null;
	public int size = 0;
	public boolean isEmpty(){
		return head==null;
	}
	public void add(T item){
		Node<T> newNode = new Node<>();
		newNode.item = item;
		newNode.next = head;
		head = newNode;
		++size;
	}
	public T remove(){
		if(isEmpty()) throw new IllegalStateException();
		T item = head.item;
		head = head.next;
		return item;
	}
	public String toString(){
		ArrayList<T> tmp = new ArrayList<>();
		for(T t: this)
			tmp.add(t);
		return tmp.toString();
	}
	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}
	public ListIterator<T> listIterator() {
		return new LinkedListIterator();
	}
}
