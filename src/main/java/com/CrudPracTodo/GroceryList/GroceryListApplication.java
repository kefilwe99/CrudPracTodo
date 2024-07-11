package com.CrudPracTodo.GroceryList;

import com.CrudPracTodo.GroceryList.Model.groceryModel;
import com.CrudPracTodo.GroceryList.Repository.groceryRepository;
import com.CrudPracTodo.GroceryList.Service.groceryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GroceryListApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(GroceryListApplication.class, args);

		//groceryModel model =context.getBean(groceryModel.class);
//		groceryRepository groceryRepository = context.getBean(com.CrudPracTodo.GroceryList.Repository.groceryRepository.class);
//		groceryRepository.groceryDelete(11);

		groceryService groceryService = context.getBean(com.CrudPracTodo.GroceryList.Service.groceryService.class);
		groceryService.groceryDelete(12);




//		groceryService service =context.getBean(groceryService.class);
//		service.groceryDelete();



		System.out.println("hello");
	}

}
