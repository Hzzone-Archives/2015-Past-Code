package no3;

public class StandardMember extends Member {
	public StandardMember(String name, String address) {
		super(name, address);
	}

	public int getFee() {
		return 50;
	}
}