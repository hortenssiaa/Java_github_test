package test.vo;

public class GithubVO {

	String id;
	String pw;
	
	public GithubVO() {
		// TODO Auto-generated constructor stub
		
		System.out.println("by issue2");
	}
	
	
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
	@Override
	public String toString() {
		return "GithubVO [id=" + id + ", pw=" + pw + "]";
	}
	
}
