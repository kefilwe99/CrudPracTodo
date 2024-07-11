package com.CrudPracTodo.GroceryList.Controler;

import com.CrudPracTodo.GroceryList.Service.groceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class groceryController {
    @Autowired
    public groceryService service;

@GetMapping("groceryDeleted/PostId")
public String getGrocery(){
    return "Get Grocery List";
}

    @DeleteMapping("/groceryDelete/{taskID}")
    public void groceryDelete (@PathVariable("taskID") int taskID){
        System.out.println("Delete Controller");
        service.groceryDelete(taskID);

    }
}





