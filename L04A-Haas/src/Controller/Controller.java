package Controller;

import Model.Model;
import View.View;

/* (first line)
Controller calls a method in View with the number of lines and columns to be displayed.
View will then call a method in CenterPanel passing the same parameters.
View has to access InitialFrame, and InitialPanel to call a method in CenterPanel
The parameters retrieved from Model are the number of lines and columns to be displayed.
This method in CenterPanel creates the header and line buttons in place, without any text yet.
*/
/* (second line)
Controller calls a method in view. This method sends the text to be displayed in the header and line buttons
View accesses InitialFrame and InitialPanel to call another method in CenterPanel
Now the parameters retrieved from Model are the text from the data tables.
*/
public class Controller
{

    Model model;
    View view;

    public Controller(View v, Model m)
    {
        model = m;
        view = v;
        
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());
        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), 
            model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
// no changes needed in Controller
//The code below will work as it is if FootballPlayerData is implemented correctly
//
//=========used in L03B =====================================================
//        view.basicDisplay("------------------------------------------------------");
//        view.basicDisplay(model.getFpData().getHeaders());
//        view.basicDisplay("size of headers=" + model.getFpData().getHeaders().size());
//        view.basicDisplay("------------------------------------------------------");
//        view.basicDisplay(model.getFpData().getLine(100));
//        view.basicDisplay("------------------------------------------------------");
//        view.linesDisplay(model.getFpData().getLines(100,103));
//        view.basicDisplay("size of lines=" + model.getFpData().getLines(100,103).size());
//        view.basicDisplay("size of line 0=" + model.getFpData().getLines(100,103).get(0).size());
//        view.basicDisplay("------------------------------------------------------");

//=========used in L03A =====================================================
//        view.basicDisplay(model.getMembers().get(1).getAttributeName(3));
//        view.basicDisplay(model.getMembers().get(1).getAttribute(3));
//        view.basicDisplay(model.getMembers().get(1).getAttributeNames());
//        view.basicDisplay(model.getMembers().get(1).getAttributes());
//        view.basicDisplay("size of names=" + model.getMembers().get(1).getAttributeNames().size());
//        view.basicDisplay("size of attributes=" + model.getMembers().get(1).getAttributes().size());
    }

}
