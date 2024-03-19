package in.pwskills.nitin.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name="PERSON")
public class Person {
	
	@Id
	@Column(name="PID")
	private Integer pid;
	
	@Column(name="PNAME")
	private String pname;
	
	@Column(name="COST")
	private double cost;
	
	@Lob
	@Column(name="IMG")
	private byte[] pimg;
	
	@Column(name="DOC")
	private char[] stdInfo;

	public Person() {
		System.out.println("PERSON OBJECT USED INTERNALLY...");
	}
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public byte[] getPimg() {
		return pimg;
	}

	public void setPimg(byte[] pimg) {
		this.pimg = pimg;
	}

	public char[] getStdInfo() {
		return stdInfo;
	}

	public void setStdInfo(char[] stdInfo) {
		this.stdInfo = stdInfo;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", cost=" + cost + ", pimg=" + Arrays.toString(pimg)
				+ ", stdInfo=" + Arrays.toString(stdInfo) + "]";
	}
	
	

}
