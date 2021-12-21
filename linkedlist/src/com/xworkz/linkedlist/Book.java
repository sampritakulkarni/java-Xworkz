package com.xworkz.linkedlist;

public class Book {

	private String name;
	private String authorName;
	private double price;
	private int noOfPages;
	
	public Book(String name, String author,double price, int noOfPages) {
		super();
		this.name=name;
		this.authorName=authorName;
		this.price=price;
		this.noOfPages=noOfPages;
		
	}
	
	public Book() {
		super();
	}
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name=name;
    	
    }
    public String getAuthorName() {
    	return authorName;
    }
    public void setAuthorName(String authorName) {
    	this.authorName=authorName;
    }
    public double getPrice() {
    	return price;
    }
    public void setPrice(double price) {
    	this.price=price;
    }
    
    public int getNoOfPages() {
    	return noOfPages;
    }
    public void setNoPages(int noOfPages) {
    	this.noOfPages=noOfPages;
    }
    @Override
    public String toString() {
    	return "Book [name="+name+",authorName="+authorName+",price="+price+",noOfPages="+noOfPages+"]";
    	
}
}
