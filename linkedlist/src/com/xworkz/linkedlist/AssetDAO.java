package com.xworkz.linkedlist;

import java.util.LinkedList;

public interface AssetDAO {
	
	LinkedList list = new LinkedList();
	
	boolean addAsset(Object object);
	boolean  searchAsset(Object object);
	void updateAsset(Object object, String newName);
	void updateAsset(Object object,double price);
	void deleteAsset(Object object);
	void listOfAsset();
	void setAsset(int index,Object object);
	void removeLastAsset();
	void removeFirstAsset();
	void getFirstAsset();
	void getLastAsset();
	void addFirstAsset(BookDTO object);
	void addLastAsset(BookDTO object);
	

}
