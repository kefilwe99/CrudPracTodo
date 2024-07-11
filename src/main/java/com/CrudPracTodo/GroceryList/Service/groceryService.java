package com.CrudPracTodo.GroceryList.Service;

import com.CrudPracTodo.GroceryList.GroceryListApplication;
import com.CrudPracTodo.GroceryList.Repository.groceryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class groceryService {
    @Autowired
    private groceryRepository repo;

    public void groceryDelete(int taskID){
        repo.groceryDelete(taskID);

    }

    public groceryRepository getRepo() {
        return repo;
    }

    public void setRepo(groceryRepository repo) {
        this.repo = repo;
    }
}
