package homework9_5;

import java.util.LinkedList;

public class Dequeue {

	private LinkedList<Object> queue;

	public Dequeue() {
		queue = new LinkedList<Object>();
	}
	
	public Dequeue(LinkedList<Object> queue) {
		setQueue(queue);
	}

	public LinkedList<Object> getQueue() {
		return queue;
	}

	public void setQueue(LinkedList<Object> queue) {
		this.queue = queue;
	}
	
	public void offerFirst(Object obj) {
		queue.offerFirst(obj);
	}
	
	public void offerLast(Object obj) {
		queue.offerLast(obj);
	}
	
	public void pollFirst() {
		queue.pollFirst();
	}
	
	public void pollLast() {
		queue.pollLast();
	}
	
	public int getSize() {
		return queue.size();
	}
}
