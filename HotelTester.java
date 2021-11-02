class HotelTester{

static String[]menuItems={"Dharwad Peda","Jamun","Gobi","Pani Puri","All Sweets"};

public static void main(String a[]){


HotelDTO dto=new HotelDTO();
dto.setHotelId(23);
dto.setName("President Hotel");
dto.setAddress("Hubli");
dto.setMenuItems(menuItems);

System.out.println(dto.getHotelId()+","+dto.getName()+","+dto.getAddress());
  
 String[] items = dto.getMenuItems();
 for(int i=0 ;i<items.length;i++){
 System.out.println(items[i]);
}

}

}