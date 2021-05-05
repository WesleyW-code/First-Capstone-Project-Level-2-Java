import java.util.*;

public class Project_Manager {

    public static void main(String[] args) {

        // Asking user to enter the menu options:
        System.out.println("WELCOME TO PROJECT MANAGER\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the following options:\n" +
                "a - Add Project.\n" +
                "d - Edit Project.\n" +
                "e - To exit.\n" +
                "Please enter your option now: ");
        String user_selection = input.next();

        // Using the selection to initiate the following codes:
        // Using main boolean for my menu.
        boolean menu_options = false;

        // If user selects 'a' the questions will be asked for all the information on the project:
        if (user_selection.equals("a")) {
            // Calling my information method:
            Information_methods.project_info();
        }
    }
}
