import java.util.*;

public class FoodManager {
    ArrayList<Food> foods = new ArrayList<>();
    public void addFood(Food food){
        foods.add(food);

    }
    public void showAllFoods(){
        if (foods.isEmpty()){
            System.out.println("Not found Food!");
        }else {
            System.out.println("Food list: ");
            for (Food student: foods){
                student.showFoodInfo();
                System.out.println("\n******************************");
            }
        }
    }

    public void removeFoodById(int id){
        boolean found = false;
        for (Food food: foods){
            if (food.getId() == id){
                foods.remove(food);
                System.out.println("Food with this id: "+id+" was removed!");
                found = true;
                break;

            }
        }
        if (!found){
            System.out.println("Food with this id: "+id+" was not found!");
        }
    }
}