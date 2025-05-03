package personality;

// Project: Personality Quiz
// Author: Quinn Clayburn
// Date: 5/2/25
// Description: Collects user inputted answer

public class PersonalityAnswer {

    private PersonalityQuestion question;
    private int selectedIndex;

    public PersonalityAnswer(PersonalityQuestion question, int selectedIndex) {
        this.question = question;
        this.selectedIndex = selectedIndex;
    }

    public PersonalityQuestion getQuestion() {
        return question;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public int getSelectedPoints() {
        return question.getPoints()[selectedIndex];
    }
}
