package chapter15;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface RFHandlerClass extends EventHandler<ActionEvent> {
    void Handle(ActionEvent e);
}
