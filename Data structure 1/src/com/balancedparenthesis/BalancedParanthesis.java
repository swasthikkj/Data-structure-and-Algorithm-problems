package com.balancedparenthesis;

public class BalancedParanthesis<T> {
	private T t;
	static int size;
	Node head;

	public BalancedParanthesis(T t) {
		this.t = t;
	}

	public boolean isEmpty() {
		if(head == null) {
			return true;
		}

		return false;
	}

	public void push(String data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void pop() {
		deleteFirst();
	}

	private void deleteFirst() {
		if (isEmpty()) {
			return;
		}

		head = head.next;
		size--;
	}

	public void peek() {
		if(isEmpty()) {
			if (isEmpty()) {
				return;
			}
			System.out.println(head.element);
		}
	}

	public int getSize() {
		System.out.println();
		return size;
	}

	public boolean checkParanthesis() {
		String expression = (String)t;
		String[] s = expression.split("(?!^)");
		for(String element: s) {
			if(element.hashCode() == "(".hashCode()) {
			}
		}

		if(isEmpty()) {
			return true;
		}

		return false;
	}
}