package encapsulation;

public class User {

	private int id=1000;
	private String userName;
	private String password;
	private boolean active;
	private boolean signedIn;
	
	public User() {
	}

	public User(int id, String userName, String password, boolean active, boolean signedIn) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.signedIn = signedIn;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isActive() {
		return true;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isSignedIn() {
		return true;
	}

	public void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [ID: "+id+", userName=" + userName + ", password=" + password + ", active=" + active + ", signedIn=" + signedIn
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
