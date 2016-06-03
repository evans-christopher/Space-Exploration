/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

/**
 *
 * @author ibdch
 */
public class MainMenuView {
    
    private String menu;
    
    public void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) //user wants to exit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                           "
                  + "\n--------------------------------------"
                  + "\nN - Start New Game"
                  + "\nL - Load Saved Game"
                  + "\nH - Open Help Menu"
                  + "\nE - Exit"
                  + "\n--------------------------------------";
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }
    
    //Chris this is where I tried implementing what I thought it wanted 
    // on page 44.
    //public boolean doAction(String choice){
        
      // choice = choice.toUpperCase(); //convert choice to upper case
   // switch (choice) {
   // case "N": // create and start a new game
   // this.startNewGame();
   // break;
   // case "G": // get and start an existing game
   // this.startExistingGame();
   // break;
   //case "H": //display the help menu
   // this.displayHelpMenu();
   // break;
   // case "S": // save current game
   // this.saveGame();
   // break;
   // default:
   // System.OutOfMemoryError.println("\n*** Invalid selection *** Please try again");
   // break;
        
        // }
    
    //return false;
    
}
