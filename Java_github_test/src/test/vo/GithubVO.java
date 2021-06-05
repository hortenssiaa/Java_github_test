package test.vo;

public class GithubVO {

	String id;
	String pw;
	
	public GithubVO(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		
		System.out.println("by issue3");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
