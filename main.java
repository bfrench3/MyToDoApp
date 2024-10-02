public class main {
    // Class to represent a single Todo item with a description and a due date
    class TodoItem {
        String description;

        public TodoItem(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Task: " + description;
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

    // Method to display all Todo items
    public void displayTodoItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(todoItems[i]);
        }
    }

    public static void main(String[] args) {
        // Create a TodoList object with space for 5 items
        main myTodoList = new main(5);
        System.out.println("change in add-todo");
        // Display all items
        myTodoList.displayTodoItems();
    }
}
