package com.xworkz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class BookImpl   implements AssetDAO{
	
	LinkedList list=new LinkedList();

	@Override
	public boolean addAsset(Object object) {
		list.add(object);
		return false;
	}

	@Override
	public boolean searchAsset(Object object) {
		return list.contains(object);
	}

	@Override
	public void updateAsset(Object object, String newName) {
		System.out.println("invoked updateAsset");
		LinkedList container=(LinkedList) list;
		int index=container.indexOf(object);
		Object asset=container.get(index);
		Book bookAsset=(Book) asset;
		BookDTO book=(BookDTO) asset;
		book.setBookName(newName);
		container.add(index,bookAsset);
		list.add(asset);
		
	}

	@Override
	public void updateAsset(Object object, double price) {
		System.out.println("invoked updateAsset");
	}

	@Override
	public void deleteAsset(Object object) {
		list.remove(object);
		
	}

	@Override
	public void listOfAsset() {
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
		
	}

	@Override
	public void setAsset(int index, Object object) {
		BookDTO dto = (BookDTO) object;
		list.add(index,dto);
		
	}

	@Override
	public void removeLastAsset() {
		list.remove();
		
	}

	@Override
	public void removeFirstAsset() {
		list.removeFirst();
		
	}

	@Override
	public void getFirstAsset() {
		System.out.println(list.getFirst());
		
	}

	@Override
	public void getLastAsset() {
		System.out.println("list.getLast()");
		
	}

	@Override
	public void addFirstAsset(BookDTO object) {
		list.addFirst(object);
		
	}

	@Override
	public void addLastAsset(BookDTO object) {
		list.addFirst(object);
	}

}
