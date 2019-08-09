package ui;

import model.Task;
import model.Todo;

public class main {


    public static void main(String[]args) {
         Todo todo1, todo2, todo3, todo4;
         Task t1, t2, t3, t4, t5;
         todo1 = new Todo("Throw party");
         todo2 = new Todo("Send out invitations");
         todo3 = new Todo("Get cake ingedients");
         todo4 = new Todo("Bake cake and food");
         t1 = new Task("Buy flour", "09/12/2017", "Whole Foods");
         t2 = new Task("Get a new cake tin on", "09/13/2017", "Williams Sonoma");
         t3 = new Task("Buy a dozen eggs on ", "09/12/2017", "Farmer's Market");
         t4 = new Task("Mix flour on", "09/14/2017", "Farmer's Market");
         t5 = new Task("Grill fillet of sole on ", "09/14/2017", "Anna's grill");

         todo1.addDoable(todo2);
         todo1.addDoable(todo3);

         todo3.addDoable(t1);
         todo3.addDoable(t2);
         todo3.addDoable(t3);

         todo1.addDoable(todo4);

         todo4.addDoable(t4);
         todo4.addDoable(t5);

         todo1.display(" ");
    }
}

