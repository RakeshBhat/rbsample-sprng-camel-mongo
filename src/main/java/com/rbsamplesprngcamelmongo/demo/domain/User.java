package com.rbsamplesprngcamelmongo.demo.domain;

public class User {
	    int age;
	    String eyeColor;
	    String name;
	    String gender;
	    String company;
	    String email;
	    String phone;
	    String address;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEyeColor() {
			return eyeColor;
		}
		public void setEyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return String.format(
					"User [age=%s, eyeColor=%s, name=%s, gender=%s, company=%s, email=%s, phone=%s, address=%s]", age,
					eyeColor, name, gender, company, email, phone, address);
		}
	    
	    
}
