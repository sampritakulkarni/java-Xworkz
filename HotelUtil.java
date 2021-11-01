import java.util.Scanner;

class HotelUtil{

public static void main(String a[]){
  Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
 int size = sc.nextInt();
  Hotel hotel= new Hotel(size);

for(int i=0;i<size;i++){

      FoodItemsDTO food = new FoodItemsDTO();
      System.out.println("Enter Food Id");
      food.setFoodId(sc.nextInt());
      System.out.println("Enter the Food name");
      food.setFoodName(sc.next());
      System.out.println("Enter the Food price");	
      food.setFoodPrice(sc.nextDouble());
       System.out.println("Enter the Food type");	
      food.setFoodType(sc.next());
      
hotel.addFoodItems(food);

}

String text=null;
do{
   System.out.println("press 1 to get all food item details");
   System.out.println("press 2 to update food name name by id");	
   System.out.println("press 3 to delete  fooditem by id");
   System.out.println("press 4 to get all food name by account id ");
    int choice =sc.nextInt();
    switch(choice){
  case 1: hotel.fetchFoodItems();
          break;
  case 2:System.out.println("Enter food Id to update Food name");
        int id = sc.nextInt();
        System.out.println("Enter updated Food name");
        String name=sc.next();
        boolean update =hotel.updateFoodNameByFoodId(id,name);
        System.out.println("Update: "+update);
        break;
 case 3:System.out.println("Enter Food id for which an entry to be deleted");
        boolean delete=hotel.DeleteByFoodId(sc.nextInt());
        System.out.println("Deleted :"+delete);
        hotel.fetchFoodItems();
        break;
case 4:System.out.println("enter id");
       hotel.getFoodNameById(sc.nextInt());
       break;
       default:
       System.out.println("Wrong choice.........");
       break;
}
System.out.println("Do you want to continue ? Y/N");
text=sc.next();
}while(text.equals("Y"));
System.out.println("Thank you for Using the Food Items Application");

}

}