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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        // prompMessage = "Please enter your name"
        
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                 "\n****************************************************"
                +"\n* Hello World!                                     *"
                +"\n****************************************************"
        );
    }
    
}
