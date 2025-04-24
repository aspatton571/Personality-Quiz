// Project name: personalityQuiz
// Author(for this class): Kaleb Edwards
// Date: 4/24/2025
// Description: This class will compute the score based off answers
// given from the personalityAnswer class. The score will determine
// if the user is introverted, extroverted, or balanced. 

package finalProject;

public class personalityCompute {

	// Attributes
	private int introvertScore;
	private int extrovertScore;
	private String result;

	// Default constructor
	public personalityCompute() {
		this.introvertScore = 0;
		this.extrovertScore = 0;
		this.result = "";
	}

	// Parameterized constructor
	public personalityCompute(int introvertScore, int extrovertScore) {
		this.introvertScore = introvertScore;
		this.extrovertScore = extrovertScore;
		scoreResults();
	}

	// Get and Set methods
	public int getIntrovertScore() {
		return introvertScore;
	}

	public void setIntrovertScore(int introvertScore) {
		this.introvertScore = introvertScore;
		scoreResults();
	}

	public int getExtrovertScore() {
		return extrovertScore;
	}

	public void setExtrovertScore(int extrovertScore) {
		this.extrovertScore = extrovertScore;
		scoreResults();
	}

	public String getResult() {
		return result;
	}

	// Method to compute the result
	private void scoreResults() {
		if (introvertScore > extrovertScore) {
			result = "You are introverted";
		} else if (extrovertScore > introvertScore) {
			result = "You are extroverted";
		} else {
			result = "You are balanced between the two";
		}
	}

}
