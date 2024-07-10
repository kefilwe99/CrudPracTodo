package com.CrudPracTodo.GroceryList.Repository;

import com.CrudPracTodo.GroceryList.Model.groceryModel;
import com.CrudPracTodo.GroceryList.Type.groceryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroceryListRepository implements groceryInterface {

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
