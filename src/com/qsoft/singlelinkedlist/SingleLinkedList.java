package com.qsoft.singlelinkedlist;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

public class SingleLinkedList {

	private List<Node> list;
	private int firstElement;

	public SingleLinkedList() {
		super();
		this.list = new ArrayList<Node>();
		this.firstElement = 0;
	}

	public SingleLinkedList(List<Node> listObject) {
		this.list = listObject;
	}

	public List<Node> getList() {
		// TODO Auto-generated method stub
		return this.list;
	}

	public int listSize() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	public void insertAfter(int i, Node newNode) {
		Node old = this.list.get(i);
		newNode.setNextNode(old.getNextNode());
		this.list.add(newNode);
		old.setNextNode(this.listSize() - 1);

	}

	public Node getNode(int position) {
		if (this.listSize() > 0) {
			Log.e("", "Test + " + this.listSize());
			Node result = this.list.get(this.firstElement);
			Log.e("", "Next node = " + result.getNextNode() + " pos = "
					+ position);
			while (result.getNextNode() != position) {
				Log.e("", "In while + " + result.getNextNode());
				result = this.list.get(result.getNextNode());
			}
			return result;
		} else {
			return null;
		}
	}
}
