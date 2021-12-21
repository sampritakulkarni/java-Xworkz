package com.xworkz.linkedlist;

public class BookTester {
	public static void main(String[] args) {
		
		AssetDAO dao = new BookImpl();
		BookDTO dto;
		
		BookDTO dto1 = new BookDTO(1,"Panchatantra",543.00,"Kuvempu");
		BookDTO dto2 = new BookDTO(2,"Data Structure",450.00,"Padma Reddy");
		BookDTO dto3 = new BookDTO(3,"ATC",400.00,"Padma Reddy");
		BookDTO dto4 = new BookDTO(4,"Aptitude Book",890.00,"Aggarwal");
		BookDTO dto5 = new BookDTO(5,"Reasoning Book",950.00,"Aggarwal");
		dao.addAsset(dto1);
		dao.addAsset(dto2);
		dao.addAsset(dto3);
		dao.addAsset(dto4);
		
		
		dao.listOfAsset();
		System.out.println();
//		dao.getFirstAsset();
//		dao.getLastAsset();
		dao.addFirstAsset(dto5);
		dao.removeLastAsset();
//		dao.removeFirstAsset();
		dao.listOfAsset();
		dao.deleteAsset(dto2);
		System.out.println();
		dao.listOfAsset();
//		 dao.searchAsset(dto3);
//		dao.updateAsset(dto3, "Story Book");
		
		
	}

}
