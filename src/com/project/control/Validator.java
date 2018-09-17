package com.project.control;

public class Validator {

	public boolean onlyNumbers(char text) {
		if (!Character.isDigit(text))
			return false;
		else
			return true;
	}

	public boolean onlyLetters(char text) {
		if (!Character.isLetter(text))
			return false;
		else
			return true;
	}
}
