
package com.CrudPracTodo.GroceryList.Controler;
import com.CrudPracTodo.GroceryList.Model.groceryModel;
import com.CrudPracTodo.GroceryList.Service.groceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CrudPracTodo.GroceryList.Type.groceryInterface;


import java.util.List;
@RestController
public class groceryController implements groceryInterface {


    @Autowired
    private groceryService groceryService;

    @GetMapping
    @Override
    public List<groceryModel> getAllGrocery() {
        return groceryService.getAllGrocery();
    }

    @Override
    public void addTask(groceryModel groceryModel) {

    }

    @Override
    public void deleteTask(int id) {

    }

    @Override
    public void updateTask(int id, String task, boolean isComplete) {

    }
}



