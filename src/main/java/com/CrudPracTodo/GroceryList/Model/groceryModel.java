package com.CrudPracTodo.GroceryList.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class groceryModel {
    private int taskId;
    private String task;
    private boolean isComplete;
}

