package no3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Society {
	private String name;
	private ManagementCttee managementCttee;
	private ArrayList<Member> members;

	public Society(String name) {
		this.name = name;
		managementCttee = new ManagementCttee();
		members = new ArrayList<Member>();
	}

	public void addMember(String name, String address) {
		boolean flag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(name)) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			Member tmp = new StandardMember(name, address);
			members.add(tmp);
		}
	}

	public void addSeniorMember(String name, String address, int fee) {
		boolean flag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(name)) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			Member tmp = new SeniorMember(name, address, fee);
			members.add(tmp);
		}
	}

	public void addCtteeMember(SeniorMember member) {
		boolean flag = false;
		for (Iterator<Member> i = members.iterator(); i.hasNext();) {
			Member tmp = (Member) i.next();
			if (tmp.getName().equals(member.getName())) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			members.add(member);
			managementCttee.addCtteeMember(member);
		} else {
			managementCttee.addCtteeMember(member);
		}
	}

	public int getFeeTotal() {
		int total = 0;
		for (int i = 0; i < members.size(); i++) {
			total += members.get(i).getFee();
		}
		return total;
	}

	// 将Member数据写入磁盘文件
	public void writeToFile() {
		try {
			String memberInfor = "";
			for(int i = 0; i < members.size(); i ++)
			{
				Member tmp = members.get(i);
				memberInfor += tmp.getName() + "_" + tmp.getAddress() + "_" + String.valueOf( tmp.getFee() ) + "\n";
			}
			// 以下路径，文件在应用文件夹下，或者采用"D:\\member.txt"，文件在D盘上
			PrintWriter writer = new PrintWriter(new FileWriter("member.txt"));
			writer.write(memberInfor);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ManagementCttee getManagementCttee() {
		return managementCttee;
	}

	public void setManagementCttee(ManagementCttee managementCttee) {
		this.managementCttee = managementCttee;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
}
