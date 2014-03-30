package pl.krzysh.learningproject.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AddStudentValidator implements Validator {
	private int DEFAULT_MIN_NAME_LENGTH = 3;
	private int DEFAULT_MAX_NAME_LENGTH = 25;
	private int minNameLength = DEFAULT_MIN_NAME_LENGTH;
	private int maxNameLength = DEFAULT_MAX_NAME_LENGTH;

	public boolean supports(Class clazz) {
		return AddStudent.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
		AddStudent pi = (AddStudent) obj;
		if (pi == null) {
			errors.rejectValue("firstName", "error.not-specified", null,
					"Value required.");
			errors.rejectValue("surName", "error.not-specified", null,
					"Value required.");
		} else {
			if (pi.getFirstName().length() > maxNameLength) {
				errors.rejectValue("firstName", "error.too-high",
						new Object[] { new Integer(maxNameLength) },
						"Value too high.");
			}
			if (pi.getFirstName().length() <= minNameLength) {
				errors.rejectValue("firstName", "error.too-low",
						new Object[] { new Integer(minNameLength) },
						"Value too low.");
			}

			if (pi.getSurName().length() > maxNameLength) {
				errors.rejectValue("surName", "error.too-high",
						new Object[] { new Integer(maxNameLength) },
						"Value too high.");
			}
			if (pi.getSurName().length() <= minNameLength) {
				errors.rejectValue("surName", "error.too-low",
						new Object[] { new Integer(minNameLength) },
						"Value too low.");
			}
		}
	}

	public int getMinNameLength() {
		return minNameLength;
	}

	public void setMinNameLength(int minNameLength) {
		this.minNameLength = minNameLength;
	}

	public int getMaxNameLength() {
		return maxNameLength;
	}

	public void setMaxNameLength(int maxNameLength) {
		this.maxNameLength = maxNameLength;
	}

}