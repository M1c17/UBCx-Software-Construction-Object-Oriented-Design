package model;

import java.util.LinkedList;
import java.util.List;


public class Todo extends Doable{

    private String description;
//    private List<Todo> subTodos;
//    private List<Task> subTasks;
    private List<Doable> subs;
//    private boolean complete;
//    private boolean subTodoComplete;
//    private boolean subTaskComplete;


    public Todo(String description) {
        super();
        this.description = description;
//        subTodos = new LinkedList<>();
//        subTasks = new LinkedList<>();
        subs = new LinkedList<>();
//        complete = false;
//        subTodoComplete = false;
//        subTaskComplete = false;

    }

    // getters
//    public List<Todo> getSubTodos() { return subTodos; }
//    public List<Task> getSubTasks() { return subTasks; }
    public List<Doable> getSubTasks() { return subs; }

    @Override
    public String getDescription() {return description; }
//    public boolean getStatus() { return complete; }

    @Override
    public void complete() {
        boolean isAllDone = true;
        for(Doable d: subs) {
            if(!d.getStatus()) {
                isAllDone = false;
            }
        }
        complete = isAllDone;
    }

    public boolean addDoable(Doable d) {
        if(!subs.contains(d)) {
            subs.add(d);
            return true;
        }else {
            return false;
        }
    }


    public boolean removeDoable(Doable d) {
        if(subs.contains(d)) {
            subs.remove(d);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void display(String indentSpace) {
        System.out.println(indentSpace + this.getDescription());
        for(Doable d: subs) {
            d.display(indentSpace + indentSpace);
        }
    }

    /**
     *
     * @param td the item we want to add to our subtodos
     * @return true if we are able to add the item with no duplicates, else false
     */
//    public boolean addTodo(Todo td) {
//        if (!subTodos.contains(td)) {
//            subTodos.add(td);
//            return true;
//        } else {
//            return false;
//        }
//    }

    /**
     *
     * @param td the item we want to remove from our subtodos
     * @return true if we are able to remove the item from our subtodos, else false
     */
//    public boolean removeTodo(Todo td) {
//        if (subTodos.contains(td)) {
//            subTodos.remove(td);
//            return true;
//        } else {
//            return false;
//        }
//    }

    /**
     *
     * @param t the task we want to add to our subtasks
     * @return true if we are able to add the item to our subtasks, else false
     */
//    public boolean addTask(Task t) {
//        if (!subTasks.contains(t)) {
//            subTasks.add(t);
//            return true;
//        } else {
//            return false;
//        }
//    }

    /**
     *
     * @param t the task we want to remove from our subtasks
     * @return true if we are able to add the item to our subtasks, else false
     */
//    public boolean removeTask(Task t) {
//        if (subTasks.contains(t)) {
//            subTasks.remove(t);
//            return true;
//        } else {
//            return false;
//        }
//    }

    /**
     *
      * @return true if the this subtodos are complete
     */
//    public boolean todosComplete() {
//        boolean areTodosComplete = true;
//        for (Todo td : subTodos) {
//            if (!td.getStatus()) {
//                areTodosComplete = false;
//            }
//        }
//        subTodoComplete = areTodosComplete;
//        return subTodoComplete;
//    }

    /**
     *
     * @return true if this subtasks are complete
     */
//    public boolean subTaskComplete() {
//        boolean aresubTasksComplete = true;
//        for (Task t : subTasks) {
//            if (!t.getStatus()) {
//                aresubTasksComplete = false;
//            }
//        }
//        subTaskComplete = aresubTasksComplete;
//        return subTaskComplete;
//    }

    /**
     *
     * @return true if THIS subtask is complete
     */
//    public boolean isThisTodoComplete() {
//        complete = subTodoComplete && subTaskComplete;
//        return complete;
//    }







}