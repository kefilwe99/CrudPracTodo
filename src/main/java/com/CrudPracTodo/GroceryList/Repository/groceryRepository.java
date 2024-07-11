package com.CrudPracTodo.GroceryList.Repository;

import com.CrudPracTodo.GroceryList.Service.groceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class groceryRepository {
    public groceryService service;
    private JdbcTemplate jdbc;

    public void groceryDelete(int taskID) {
        String query = "DELETE FROM grocerylist WHERE id = ?";

        int row = jdbc.update(query,taskID);

//        if (row < 0) {
//            System.out.println("Deleted");
//        } else {
//            System.out.println("Did not delete");
//        }


//        for (GroceryItems groceryitems : groceries) {
//            if (groceryitems.getPostId() = postId) {
//                groceryitems.remove(groceryDelete());
//            }
//        }
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}


