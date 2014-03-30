package pl.krzysh.learningproject.domain;

public abstract class User implements Comparable<User> {
	private String firstName;
	private String surName;

	public String toString() {
		return firstName + " " + surName;
	}

	public void setName(String firstName, String surName) {
		this.firstName = firstName;
		this.surName = surName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getSurName() {
		return this.surName;
	}

	@Override
	public int compareTo(User other) {
		int surNameCompare = surName.compareTo(other.getSurName());
		if (surNameCompare != 0)
			return surNameCompare;

		return firstName.compareTo(other.getFirstName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}
}
