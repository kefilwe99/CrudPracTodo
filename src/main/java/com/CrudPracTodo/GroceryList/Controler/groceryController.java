
package com.CrudPracTodo.GroceryList.Controler;
import com.CrudPracTodo.GroceryList.Model.groceryModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CrudPracTodo.GroceryList.Type.groceryInterface;


import java.util.List;
@RestController
public class groceryController implements groceryInterface {


    @Override
    public List<groceryModel> onRead() {
        return List.of();
    }

    @Override
    public void addTask(groceryModel groceryModel) {

    }

    @Override
    public void deleteTask(int id) {

    }

    @Override
    public void updateTask(int id, String task, boolean isCompele) {

    }
}


