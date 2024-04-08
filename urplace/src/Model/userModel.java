package Model;
import java.io.Serializable;
import jakarta.persistence.*;
@Entity
@Table(name="User")
public class userModel implements Serializable {
	private static final long serialVersionID = 1L;
	
	@Column (name="code")
	@Id
    private int code;
	
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String cellphone;

    public userModel() {}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Override
	public String toString() {
		return "userModel [code=" + code + ", name=" + name + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", cellphone=" + cellphone + "]";
	}
    
	
}
