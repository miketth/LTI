package LTI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField input, result;
    public Button start;
    public Label correctness;
    public void go()
    {
        try {
            correctness.setText(testIt.Companion.testIt(input.getText(),result.getText()));
        }catch (Exception e) {
            correctness.setText("Rossz formátum");
        }
    }
}
