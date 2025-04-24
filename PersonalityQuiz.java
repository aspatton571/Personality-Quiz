// Project: Personality Quiz
// Author: Andrew Patton
// Date: 04/24/2025
// Description: This class controls the overall flow of this personality quiz
// including asking the questions, collecting the answers, and calling the 
// compute class to determine if they are an introvert or extrovert. 

package personality;

import java.util.List;
import java.util.ArrayList;

public class PersonalityQuiz {

    private List<PersonalityQuestion> questions;
    private List<PersonalityAnswer> answers;

    public PersonalityQuiz() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public PersonalityQuiz(List<PersonalityQuestion> questions, List<PersonalityAnswer> answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public List<PersonalityQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<PersonalityQuestion> questions) {
        this.questions = questions;
    }

    public List<PersonalityAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<PersonalityAnswer> answers) {
        this.answers = answers;
    }

    public void startQuiz() {
        
    }
}
