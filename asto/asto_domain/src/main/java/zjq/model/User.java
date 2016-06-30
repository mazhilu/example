package zjq.model;

import java.util.List;

public class User {
	// private List<emp> emp;
	private List<usertest> userget;
	private Integer id;

	private String name;

	private Integer age;

	public List<usertest> getUserget() {
		return userget;
	}

	public void setUserget(List<usertest> userget) {
		this.userget = userget;
	}

	/*
	 * public List<emp> getEmp() { return emp; }
	 * 
	 * public void setEmp(List<emp> emp) { this.emp = emp; }
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}