
package com.CrudPracTodo.GroceryList.Service;

import com.CrudPracTodo.GroceryList.Repository.GroceryListRepository;

import com.CrudPracTodo.GroceryList.Model.groceryModel;
import com.CrudPracTodo.GroceryList.Type.groceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class groceryService implements groceryInterface {



    @Autowired
    private GroceryListRepository GroceryListRepository;

    @Override
    public List<groceryModel> getAllGrocery() {
    return List.of();

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
