package com.qsoft.singlelinkedlist;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {

	// 1 - New LinkedList should be EMPTY
	public void testNewLinkedListShouldBeEmpty() {
		SingleLinkedList newList = new SingleLinkedList();
		assertTrue(newList.getList().isEmpty());
	}

	// 2 - Create new LinkedList from an array of Objects
	public void testNewLinkedListFromArray() {
		List<Node> listObject = new ArrayList<Node>();
		listObject.add(new Node());
		listObject.add(new Node());
		listObject.add(new Node());
		listObject.add(new Node());
		listObject.add(new Node());
		SingleLinkedList newList = new SingleLinkedList(listObject);
		assertEquals(listObject.size(), newList.getList().size());
	}

	// 3 - The method listSize() should return the number of elements in the
	// list
	public void testMethodListSizeShouldReturnTheNumberOfElementInList() {
		List<Node> listObject = new ArrayList<Node>();
		listObject.add(new Node());
		listObject.add(new Node());
		listObject.add(new Node());
		listObject.add(new Node());
		listObject.add(new Node());
		SingleLinkedList newList = new SingleLinkedList(listObject);

		assertEquals(5, newList.listSize());
	}

	// 4 - Insert new element after node n, nextNode of Node n should be updated
	public void testInsertNewElementAfterNodeN() {
		List<Node> listObject = new ArrayList<Node>();
		listObject.add(new Node("value", 1));
		listObject.add(new Node("value", 2));
		listObject.add(new Node("value", 3));
		listObject.add(new Node("value", 4));
		listObject.add(new Node("value", null));

		SingleLinkedList list = new SingleLinkedList(listObject);

		int position = 3;
		Node newNode = new Node("This is new Node", null);

		list.insertAfter(position, newNode);
		
		Node test = list.getNode(position);
		assertEquals(newNode.getValue(), test.getValue());
	}

}
