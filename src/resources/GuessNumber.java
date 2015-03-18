package resources;

import java.io.Serializable;


import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped

public class GuessNumber implements Serializable{
	private int number;
	private String guessstring;

	public GuessNumber() {
		number = (int) (Math.random() * 100);
	}

	public String getGuessstring() {
		return guessstring;
	}

	public void setGuessstring(String guessstring) {
		this.guessstring = guessstring;
	}

	public String getResponse() {
		if (guessstring == null) {
			return "";
		}

		String temp;
		int guess = Integer.parseInt(guessstring);

		if (guess < number) {
			temp = "Too low";
		} else {
			if (guess == number) {
				temp = "You got it!";
			} else {
				temp = "Too high";
			}

		}
		return temp;
	}
}
