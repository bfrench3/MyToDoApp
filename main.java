import java.util.Date;

public class main {
    // Class to represent a single Todo item with a description and a due date
    class TodoItem {
        String description2;
        Date dueDate;

        public TodoItem(String description, Date dueDate) {
            this.description2 = description;
            this.dueDate = dueDate;
        }

        public TodoItem(String description2) {
            //TODO Auto-generated constructor stub
        }

        @Override
        public String toString() {
            return "Task " + description2 + " | Due Date: " + dueDate;
        }
    }

    // Array to store the Todo items
    private TodoItem[] todoItems;
    private int count;

    // Constructor
    public main(int size) {
        todoItems = new TodoItem[size];
        count = 0;
    }

    // Method to add a Todo item
    public void addTodoItem(String description) {
        if (count < todoItems.length) {
            todoItems[count] = new TodoItem(description);
            count++;
        } else {
            System.out.println("Todo list is full!");
        }
    }
    
    // Method to display all Todo items
    public void displayTodoItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(todoItems[i]);
        }
    }

    public static void main(String[] args) {
        // Create a TodoList object with space for 5 items
        main myTodoList = new main(5);
        System.out.println("change for add-date");
        // Add some todo items
        myTodoList.addTodoItem("Finish Java assignment");
        myTodoList.addTodoItem("Grocery shopping");
        
        // Display all items
        myTodoList.displayTodoItems();
    }
}
