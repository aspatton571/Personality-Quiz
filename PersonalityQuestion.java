package personality;

// Project: Personality Quiz
// Author: Quinn Clayburn
// Date: 5/2/25
// Description: Contains the quiz questions

public class PersonalityQuestion {

    private String questionText;
    private String[] choices;
    private int[] points; // Points for each choice (positive for extrovert, negative for introvert)

    public PersonalityQuestion(String questionText, String[] choices, int[] points) {
        this.questionText = questionText;
        this.choices = choices;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getChoices() {
        return choices;
    }

    public int[] getPoints() {
        return points;
    }
}
