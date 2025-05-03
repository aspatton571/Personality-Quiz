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

    public List<PersonalityQuestion> questions;
    public List<PersonalityAnswer> answers;

    public PersonalityQuiz() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();

        questions.add(new PersonalityQuestion("Do you enjoy hanging out with large groups of people?", new String[]{"Yes", "Sometimes", "No"}, new int[]{2,0,-2}));
        questions.add(new PersonalityQuestion("Do you prefer working alone?", new String[]{"Yes", "Sometimes", "No"}, new int[]{-2,0,2}));
        questions.add(new PersonalityQuestion("Do you get tired after a lot of social interaction?", new String[]{"Yes", "Sometimes", "No"}, new int[]{-2,0,2}));
        questions.add(new PersonalityQuestion("Do you feel energized after talking to people?", new String[]{"Yes", "Sometimes", "No"}, new int[]{2,0,-2}));
        questions.add(new PersonalityQuestion("Do you prefer to text people instead of calling?", new String[]{"Yes", "Sometimes", "No"}, new int[]{-2,0,2}));
        questions.add(new PersonalityQuestion("Do you enjoy meeting new people?", new String[]{"Yes", "Sometimes", "No"}, new int[]{2,0,-2}));
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
        int introvertPoints = 0;
        int extrovertPoints = 0;

        for (PersonalityQuestion q : questions) {

            int choice = (int) (Math.random() * q.getChoices().length);

            PersonalityAnswer answer = new PersonalityAnswer(q, choice);
            answers.add(answer);

            int points = answer.getSelectedPoints();
            if (points < 0) {
                introvertPoints += Math.abs(points);
            } else {
                extrovertPoints += points;
            }
        }

        PersonalityCompute compute = new PersonalityCompute(introvertPoints, extrovertPoints);
        System.out.println(compute.getResult());
    }



}
