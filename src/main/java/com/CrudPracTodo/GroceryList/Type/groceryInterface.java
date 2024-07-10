package com.CrudPracTodo.GroceryList.Type;

import com.CrudPracTodo.GroceryList.Model.groceryModel;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface groceryInterface {
    public List<groceryModel> onRead();
    public void addTask (groceryModel groceryModel);
    public void deleteTask (int id);
    public void updateTask (int id, String task, boolean isCompele);

    }






