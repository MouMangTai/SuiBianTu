package Bean;

import java.io.Serializable;

public class User implements Serializable{
	String mail;
	String mima;
	String name;
	String xingming;
	String xingbie;
	String nianji;
	String shenfen;
	String qq;
	String phone;
	int isAdmin;
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMima() {
		return mima;
	}
	public void setMima(String mima) {
		this.mima = mima;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getXingbie() {
		return xingbie;
	}
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	public String getNianji() {
		return nianji;
	}
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	public String getShenfen() {
		return shenfen;
	}
	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
