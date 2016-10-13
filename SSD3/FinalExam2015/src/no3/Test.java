package no3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Society club = new Society("Tiger");
		club.addMember("Alice", "Boston");
		club.addMember("Mike", "NY");
		club.addMember("Mike", "NY");//name ��Ϊ��ʶ�����Ѽ���Society�����ٴμ���
		club.addSeniorMember("Bob", "Washington", 99);
		club.addSeniorMember("Charley", "NY", 200);
		club.addSeniorMember("Charley", "NY", 200);//name ��Ϊ��ʶ�����Ѽ���Society�����ٴμ���
		SeniorMember sm1 = new SeniorMember("Charley", "NY", 200);
		SeniorMember sm2 = new SeniorMember("David", "Boston", 150);
		club.addCtteeMember(sm1);//name ��Ϊ��ʶ�����Ѽ���Society�����ٴμ��룬��Ҫ����Cttee
		club.addCtteeMember(sm1);//name ��Ϊ��ʶ�����Ѽ���Society��Cttee�����ٴμ���
		club.addCtteeMember(sm2);//name ��Ϊ��ʶ��������Society��Cttee
		Vector<Member> ctteeM = club.getManagementCttee().getMembers();
		System.out.println("ManagementCttee Members:");
		for (Iterator<Member> i = ctteeM.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			System.out.println(tmp.getName() + "_" + tmp.getAddress() +
					"_" + String.valueOf( tmp.getFee() ));
		}
		ArrayList<Member> societyM = club.getMembers();
		System.out.println("---------------------");
		System.out.println("All Society Members:");
		for (Iterator<Member> i = societyM.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			System.out.println(tmp.getName() + "_" + tmp.getAddress() +
					"_" + String.valueOf( tmp.getFee() ));
		}
		System.out.println("---------------------");
		System.out.println("Total Fee : "+club.getFeeTotal());
		club.writeToFile();
	}
}
