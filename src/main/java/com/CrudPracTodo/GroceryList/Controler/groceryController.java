package com.CrudPracTodo.GroceryList.Controler;
import com.CrudPracTodo.GroceryList.Model.groceryModel;
import com.CrudPracTodo.GroceryList.Service.groceryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class groceryController {



    @GetMapping("/")
public String getGroceryList(){
    return "Get Grocery List";
}

}
