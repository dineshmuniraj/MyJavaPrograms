
public class Customer implements Comparable<Customer>{
	private int ssno;
	private String name;
	private String email;

	public Customer() {

	}

	public Customer(int ssno, String name, String email) {
		this.ssno = ssno;
		this.name = name;
		this.email = email;
	}

	public int getSsno() {
		return ssno;
	}

	public void setSsno(int ssno) {
		this.ssno = ssno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ssno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ssno != other.ssno)
			return false;
		return true;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	

	@Override
	public String toString() {
		return "Customer [ssno=" + ssno + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return name.compareTo(o.name);
	}

}
