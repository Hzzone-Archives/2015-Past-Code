package no3;

import java.util.Iterator;
import java.util.Vector;

public class ManagementCttee {
	private Vector<Member> members;

	// private Vector<SeniorMember> members; 这样也可以，看未来需不需要拓展程序
	public ManagementCttee() {
		members = new Vector<Member>();
	}

	public void addCtteeMember(SeniorMember s) {
		boolean containedFlag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(s.getName())) {
				containedFlag = true;
				break;
			}
		}
		if (!containedFlag) {
			members.add(s);
		}
	}

	public void removeCtteeMember(String name) {
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			SeniorMember tmp = (SeniorMember) i.next();
			if (tmp.getName().equals(name))
				members.remove(tmp);
		}
	}
	public Vector<Member> getMembers() {
		return members;
	}
}