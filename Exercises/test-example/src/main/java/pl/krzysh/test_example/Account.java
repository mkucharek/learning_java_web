package pl.krzysh.test_example;

public class Account {
	private int money = 0;

	public void addMoney(int i) {
		money += i;
	}

	public int getMoney() {
		return money;
	}

	public void removeMoney(int i) {
		money -= i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
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
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		return true;
	}

}
