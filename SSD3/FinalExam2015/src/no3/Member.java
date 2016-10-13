package no3;

public abstract class Member {
	private String name;
	private String address;

	public Member(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public abstract int getFee();
}
