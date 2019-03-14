package com.cl;
class Test12 {
	private int age;
	private String name;

	@Override
	public String toString() {
		return "Test [age=" + age + ", name=" + name + "]";
	}

	public Test12(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Test12 other = (Test12) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class TestD {

	public static void main(String[] args) {
		Test12 r = new Test12(1, "12");
		System.out.println(r);
	}

}
