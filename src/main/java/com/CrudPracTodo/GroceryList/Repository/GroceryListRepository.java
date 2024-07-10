package com.CrudPracTodo.GroceryList.Repository;

import com.CrudPracTodo.GroceryList.Model.groceryModel;
import com.CrudPracTodo.GroceryList.Type.groceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroceryListRepository implements groceryInterface {

   private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

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
