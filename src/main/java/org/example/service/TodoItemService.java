package org.example.service;

import org.example.model.TodoData;
import org.example.model.TodoItem;

import java.util.List;

public interface TodoItemService {

    void addItem(TodoItem todoItem);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem todoItem);
    TodoData getData();

}
