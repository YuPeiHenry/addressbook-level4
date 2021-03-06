package seedu.thanepark.commons.events.ui;

import seedu.thanepark.commons.events.BaseEvent;

/**
 * An event requesting to view the help page.
 */
public class SuggestCommandEvent extends BaseEvent {

    public final String[] commandWords;

    public SuggestCommandEvent(String[] commandWords) {
        this.commandWords = commandWords;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
