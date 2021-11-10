class HeadPhoneDTOUtil{
	public static void main(String[] args){
		HeadPhoneDTO headphone = new HeadPhoneDTO();
		headphone.setBrand("Apple");
		headphone.setFeatures("Wireless");
		headphone.setColor("Black and pink");
		headphone.setPrice(782.00);

		System.out.println(headphone.getBrand()+ ",  "+headphone.getFeatures()+ ", "+headphone.getColor()+ ", "+headphone.getPrice());
		System.out.println(headphone);
	}
} 