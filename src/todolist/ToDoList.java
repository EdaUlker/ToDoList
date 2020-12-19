import javax.swing.*;
import java.util.List;

public class ToDoList {
    private DefaultListModel<String> todoList;
    private DefaultListModel<String> completedList;

    //Nesnenin create methodu ve listeler oluşturulur
    public ToDoList(){
        this.todoList = new DefaultListModel<>();
        this.completedList = new DefaultListModel<>();
    }

    public DefaultListModel<String> getCompletedList() {
        return completedList;
    }

    public void setCompletedList(DefaultListModel<String> completedList) {
        this.completedList = completedList;
    }

    public DefaultListModel<String> getTodoList() {
        return todoList;
    }

    public void setTodoList(DefaultListModel<String> todoList) {
        this.todoList = todoList;
    }

    //Add todolist
    public void addList(String todo){
        this.todoList.addElement(todo);
    }
    //Remove todolist
    public void deleteList(String todo){
        for(int i=0;i<this.todoList.size();i++) {
            if(todo.equals(this.todoList.get(i))) {
                this.todoList.remove(i);
            }
        }
    }
    //Add completedList
    public void addCompletedList(String completed){
        this.completedList.addElement(completed);
    }
    //Remove completedList
    public void removeCompletedList(String completed){
        for(int i=0;i<this.completedList.size();i++) {
            if(completed.equals(this.completedList.get(i))) {
                this.completedList.remove(i);
            }
        }
    }
}
